	package com.student.receipts.model;
	
	import java.util.List;
	
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Repository;
	
	@Repository
	public class ReceiptRepository {
	
	    private final JdbcTemplate jdbcTemplate;
	
	    public ReceiptRepository(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }
	
//	    // ✅ Insert Receipt (exclude receiptId if AUTO_INCREMENT)
//	//    public int save(Receipt receipt) {
//	//    	String sql = "INSERT INTO receipts (student_name, student_class, amount, payment_date, payment_mode, description) VALUES (?, ?, ?, ?, ?, ?)";
//	//        return jdbcTemplate.update(sql,
//	//                receipt.getStudentName(),
//	//                receipt.getStudentClass(),
//	//                receipt.getAmount(),
//	//                receipt.getPaymentDate(),
//	//                receipt.getPaymentMode(),
//	//                receipt.getDescription()
//	//        );
//	//    }
	    public int save(Receipt receipt) {
	        System.out.println("Saving receipt: " + receipt.getStudentName() + ", " + receipt.getAmount());
	        String sql = "INSERT INTO receipts (student_name, student_class, amount, payment_date, payment_mode, description) VALUES (?, ?, ?, ?, ?, ?)";
	        int rows = jdbcTemplate.update(sql,
	                receipt.getStudentName(),
	                receipt.getStudentClass(),
	                receipt.getAmount(),
	                receipt.getPaymentDate(),
	                receipt.getPaymentMode(),
	                receipt.getDescription()
	        );
	        System.out.println("Rows inserted: " + rows);
	        return rows;
	    }
	    
	    public List<Receipt> getAllReceipts() {
	        String sql = "SELECT * FROM receipts";
	        return jdbcTemplate.query(sql, (rs, rowNum) -> {
	            Receipt r = new Receipt();
	            r.setReceiptId(rs.getLong("receipt_id"));
	            r.setStudentName(rs.getString("student_name"));
	            r.setStudentClass(rs.getString("student_class"));
	            r.setAmount(rs.getDouble("amount"));
	            r.setPaymentDate(rs.getString("payment_date"));
	            r.setPaymentMode(rs.getString("payment_mode"));
	            r.setDescription(rs.getString("description"));
	            return r;
	        });
	    }

	
	    public int update(Receipt receipt) {
	        String sql = "UPDATE receipts SET student_name = ?, student_class = ?, amount = ?, payment_date = ?, payment_mode = ?, description = ? WHERE receipt_id = ?";
	        return jdbcTemplate.update(sql,
	                receipt.getStudentName(),
	                receipt.getStudentClass(),
	                receipt.getAmount(),
	                receipt.getPaymentDate(),
	                receipt.getPaymentMode(),
	                receipt.getDescription(),
	                receipt.getReceiptId());
    }
	
	    // ✅ Delete
	    public int delete(long receiptId) {
	        String sql = "DELETE FROM receipts WHERE receipt_id = ?";
	        return jdbcTemplate.update(sql, receiptId);
	    }
	
	}



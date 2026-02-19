package com.student.receipts.model;

public class Receipt {

    private Long receiptId;
    private String studentName;
    private String studentClass;
    private Double amount;
    private String paymentDate;
    private String paymentMode;
    private String description;

    // ✅ No-arg constructor (needed by Spring/Jackson)
    public Receipt() {}

    public Receipt(String studentName, String studentClass, Double amount, String paymentDate, String paymentMode, String description) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.description = description;
    }

    public Long getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentClass() {
        return studentClass;
    }
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public String getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

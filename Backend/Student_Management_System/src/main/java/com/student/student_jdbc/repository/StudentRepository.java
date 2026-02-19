package com.student.student_jdbc.repository;


import com.student.student_jdbc.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class StudentRepository {
//    private final JdbcTemplate jdbcTemplate;
//
//    public StudentRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    // Insert Student
//    public int save(Student student) {
//        String sql = "INSERT INTO students (first_name, last_name, email, phone) VALUES (?, ?, ?, ?)";
//        return jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getEmail(), student.getPhone());
//    }
//
//    // Get All Students
//    public List<Student> findAll() {
//        String sql = "SELECT * FROM students";
//        return jdbcTemplate.query(sql, (rs, rowNum) -> {
//            Student s = new Student();
//            s.setId(rs.getInt("id"));
//            s.setFirstName(rs.getString("first_name"));
//            s.setLastName(rs.getString("last_name"));
//            s.setEmail(rs.getString("email"));
//            s.setPhone(rs.getString("phone"));
//            return s;
//        });
//    }
//
//    // Update Student
//    public int update(Student student) {
//        String sql = "UPDATE students SET first_name=?, last_name=?, email=?, phone=? WHERE id=?";
//        return jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getEmail(), student.getPhone(), student.getId());
//    }
//
//    // Delete Student by ID
//    public int deleteById(int id) {
//        String sql = "DELETE FROM students WHERE id=?";
//        return jdbcTemplate.update(sql, id);
//    }
//}




////new
//@Repository
//public class StudentRepository {
//    private final JdbcTemplate jdbcTemplate;
//
//    public StudentRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    // Insert Student
//    public int save(Student student) {
//        String sql = "INSERT INTO students (first_name, last_name, email, phone, gender, date_of_birth, course, department, year_of_admission) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        return jdbcTemplate.update(sql,
//                student.getFirstName(),
//                student.getLastName(),
//                student.getEmail(),
//                student.getPhone(),
//                student.getGender(),
//                student.getDateOfBirth(),
//                student.getCourse(),
//                student.getDepartment(),
//                student.getYearOfAdmission()
//        );
//    }
//
//    // Get All Students
//    public List<Student> findAll() {
//        String sql = "SELECT * FROM students";
//        return jdbcTemplate.query(sql, (rs, rowNum) -> {
//            Student s = new Student();
//            s.setId(rs.getInt("id"));
//            s.setFirstName(rs.getString("first_name"));
//            s.setLastName(rs.getString("last_name"));
//            s.setEmail(rs.getString("email"));
//            s.setPhone(rs.getString("phone"));
//            s.setGender(rs.getString("gender"));
//            s.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
//            s.setCourse(rs.getString("course"));
//            s.setDepartment(rs.getString("department"));
//            s.setYearOfAdmission(rs.getInt("year_of_admission"));
//            return s;
//        });
//    }
//
//    // Update Student
//    public int update(Student student) {
//        String sql = "UPDATE students SET first_name=?, last_name=?, email=?, phone=?, gender=?, date_of_birth=?, course=?, department=?, year_of_admission=? WHERE id=?";
//        return jdbcTemplate.update(sql,
//                student.getFirstName(),
//                student.getLastName(),
//                student.getEmail(),
//                student.getPhone(),
//                student.getGender(),
//                student.getDateOfBirth(),
//                student.getCourse(),
//                student.getDepartment(),
//                student.getYearOfAdmission(),
//                student.getId()
//        );
//    }
//
//    // Delete Student by ID
//    public int deleteById(int id) {
//        String sql = "DELETE FROM students WHERE id=?";
//        return jdbcTemplate.update(sql, id);
//    }
//}

@Repository
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Insert Student
    public int save(Student student) {
        String sql = "INSERT INTO students (first_name, last_name, email, phone, gender, date_of_birth, course, department, year_of_admission) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getPhone(),
                student.getGender(),
                student.getDateOfBirth(),
                student.getCourse(),
                student.getDepartment(),
                student.getYearOfAdmission()
        );
    }

    // Get All Students
    public List<Student> findAll() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setFirstName(rs.getString("first_name"));
            s.setLastName(rs.getString("last_name"));
            s.setEmail(rs.getString("email"));
            s.setPhone(rs.getString("phone"));
            s.setGender(rs.getString("gender"));

            java.sql.Date dob = rs.getDate("date_of_birth");
            if (dob != null) s.setDateOfBirth(dob.toLocalDate());

            s.setCourse(rs.getString("course"));
            s.setDepartment(rs.getString("department"));
            s.setYearOfAdmission(rs.getInt("year_of_admission"));
            return s;
        });
    }

    // Update Student
    public int update(Student student) {
        String sql = "UPDATE students SET first_name=?, last_name=?, email=?, phone=?, gender=?, date_of_birth=?, course=?, department=?, year_of_admission=? WHERE id=?";
        return jdbcTemplate.update(sql,
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getPhone(),
                student.getGender(),
                student.getDateOfBirth(),
                student.getCourse(),
                student.getDepartment(),
                student.getYearOfAdmission(),
                student.getId()
        );
    }

    // Delete Student by ID
    public int deleteById(int id) {
        String sql = "DELETE FROM students WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }
}
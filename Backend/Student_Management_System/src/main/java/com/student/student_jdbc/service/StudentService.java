package com.student.student_jdbc.service;


import com.student.student_jdbc.model.Student;
import com.student.student_jdbc.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

//@Service
//public class StudentService {
//    private final StudentRepository repository;
//
//    public StudentService(StudentRepository repository) {
//        this.repository = repository;
//    }
//
//    public int addStudent(Student student) {
//        return repository.save(student);
//    }
//
//    public List<Student> getAllStudents() {
//        return repository.findAll();
//    }
//
//    // Update Student
//    public int updateStudent(Student student) {
//        return repository.update(student);
//    }
//
//    // Delete Student
//    public int deleteStudent(int id) {
//        return repository.deleteById(id);
//    }
//}

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public int addStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public int updateStudent(Student student) {
        return repository.update(student);
    }

    public int deleteStudent(int id) {
        return repository.deleteById(id);
    }
}
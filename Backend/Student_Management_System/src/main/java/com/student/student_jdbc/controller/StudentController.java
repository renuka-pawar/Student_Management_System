package com.student.student_jdbc.controller;


import com.student.student_jdbc.model.Student;
import com.student.student_jdbc.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return "Student added successfully!";
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
        return "Student updated successfully!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student deleted successfully!";
    }
}
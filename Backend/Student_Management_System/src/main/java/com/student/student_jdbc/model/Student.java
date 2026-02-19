////package com.student.student_jdbc.model;
////
////public class Student {
////    private int id;
////    private String firstName;
////    private String lastName;
////    private String email;
////    private String phone;
////
////    // Constructors
////    public Student() {}
////    
////    public Student(String firstName, String lastName, String email, String phone) {
////        this.firstName = firstName;
////        this.lastName = lastName;
////        this.email = email;
////        this.phone = phone;
////    }
////
////    // Getters & Setters
////    public int getId() { return id; }
////    public void setId(int id) { this.id = id; }
////
////    public String getFirstName() { return firstName; }
////    public void setFirstName(String firstName) { this.firstName = firstName; }
////
////    public String getLastName() { return lastName; }
////    public void setLastName(String lastName) { this.lastName = lastName; }
////
////    public String getEmail() { return email; }
////    public void setEmail(String email) { this.email = email; }
////
////    public String getPhone() { return phone; }
////    public void setPhone(String phone) { this.phone = phone; }
////}
//
//package com.student.student_jdbc.model;
//
//import java.time.LocalDate;
//
//public class Student {
//    private int id;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String phone;
//    
//    private String gender;           // New field
//    private LocalDate dateOfBirth;   // New field
//    private String course;           // New field
//    private String department;       // New field
//    private int yearOfAdmission;     // New field
//
//    // Constructors
//    public Student() {}
//
//    public Student(String firstName, String lastName, String email, String phone,
//                   String gender, LocalDate dateOfBirth, String course, String department, int yearOfAdmission) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.gender = gender;
//        this.dateOfBirth = dateOfBirth;
//        this.course = course;
//        this.department = department;
//        this.yearOfAdmission = yearOfAdmission;
//    }
//
//    // Getters & Setters
//    public int getId() { return id; }
//    public void setId(int id) { this.id = id; }
//
//    public String getFirstName() { return firstName; }
//    public void setFirstName(String firstName) { this.firstName = firstName; }
//
//    public String getLastName() { return lastName; }
//    public void setLastName(String lastName) { this.lastName = lastName; }
//
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
//
//    public String getPhone() { return phone; }
//    public void setPhone(String phone) { this.phone = phone; }
//
//    public String getGender() { return gender; }
//    public void setGender(String gender) { this.gender = gender; }
//
//    public LocalDate getDateOfBirth() { return dateOfBirth; }
//    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
//
//    public String getCourse() { return course; }
//    public void setCourse(String course) { this.course = course; }
//
//    public String getDepartment() { return department; }
//    public void setDepartment(String department) { this.department = department; }
//
//    public int getYearOfAdmission() { return yearOfAdmission; }
//    public void setYearOfAdmission(int yearOfAdmission) { this.yearOfAdmission = yearOfAdmission; }
//}
//

package com.student.student_jdbc.model;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;  // <- हे import करा

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    
    private String gender;            // New field

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")  // <- हे annotation add करा
    private LocalDate dateOfBirth;    // New field

    private String course;            // New field
    private String department;        // New field
    private int yearOfAdmission;      // New field

    // Constructors
    public Student() {}

    public Student(String firstName, String lastName, String email, String phone,
                   String gender, LocalDate dateOfBirth, String course, String department, int yearOfAdmission) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
        this.department = department;
        this.yearOfAdmission = yearOfAdmission;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYearOfAdmission() { return yearOfAdmission; }
    public void setYearOfAdmission(int yearOfAdmission) { this.yearOfAdmission = yearOfAdmission; }
}


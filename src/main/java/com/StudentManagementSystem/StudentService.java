package com.StudentManagementSystem;


import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    List<Student> searchStudentsByName(String keyword);

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
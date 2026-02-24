package com.StudentManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Display list
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }

    // Show add form
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "add";
    }

    // Save student
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    // Show update form
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "add";
    }

    // Delete student
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        this.studentService.deleteStudentById(id);
        return "redirect:/";
    }
}

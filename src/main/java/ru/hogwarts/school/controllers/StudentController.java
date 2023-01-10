package ru.hogwarts.school.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hogwarts.school.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    public long hello() {
        return 3;
    }
}

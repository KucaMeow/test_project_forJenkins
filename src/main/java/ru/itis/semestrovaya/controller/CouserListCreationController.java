package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.semestrovaya.service.CoursesService;

@Controller
public class CouserListCreationController {

    @Autowired
    CoursesService cousesService;

    @GetMapping("/create/list")
    public String getPage(Model model) {
        model.addAttribute("courseList", cousesService.getAllCourses());
        return "courseListCreation";
    }
}

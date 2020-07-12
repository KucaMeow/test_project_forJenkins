package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.semestrovaya.service.CoursesService;

@Controller
public class MainPageController {

    @Autowired
    CoursesService coursesService;

    @GetMapping("/hello")
    public String getMainPage(Model model) {
        model.addAttribute("course", coursesService.getIdOfMostRelevantCourse());
        return "home";
    }

    @GetMapping
    public String getDefaultPage() {
        return "redirect:/hello";
    }
}

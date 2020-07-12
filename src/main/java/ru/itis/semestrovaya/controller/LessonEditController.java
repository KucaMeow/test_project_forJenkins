package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.semestrovaya.model.Course;
import ru.itis.semestrovaya.model.Lesson;
import ru.itis.semestrovaya.service.LessonsService;

@Controller
public class LessonEditController {

    @Autowired
    LessonsService lessonsService;

    @GetMapping("/edit/lesson/{id}")
    public String getEditPage(@PathVariable long id, Model model) {
        Lesson lesson = lessonsService.getLessont(id);
        if(lesson == null) {
            return "redirect:/create/list";
        }
        model.addAttribute("lesson", lesson);
        return "editLesson";
    }

    @PostMapping("create/lesson")
    public String createCourse(@RequestParam long courseId) {
        Lesson lesson = lessonsService.addLessonToCourse(courseId);
        return "redirect:/edit/lesson/" + lesson.getId();
    }
}

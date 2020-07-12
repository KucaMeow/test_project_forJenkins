package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.semestrovaya.model.Course;
import ru.itis.semestrovaya.model.Lesson;
import ru.itis.semestrovaya.service.CoursesService;
import ru.itis.semestrovaya.service.LessonsService;

import java.util.List;

@Controller
public class ShowCourseController {

    @Autowired
    CoursesService coursesService;
    @Autowired
    LessonsService lessonsService;

    @GetMapping("/courses")
    public String getCoursesListPage(Model model) {
        List<Course> courses = coursesService.getAllCourses();
        model.addAttribute("courses", courses);
        return "coursesList";
    }

    @GetMapping("/learn/{id}")
    public String getCoursePage (@PathVariable long id, Model model) {
        Course course = coursesService.getCourse(id);
//        course.check();
        model.addAttribute("course", course);
        return "coursePage";
    }

    @GetMapping("/learn/lesson/{id}")
    public String getLessonPage (@PathVariable long id, Model model) {
        Lesson lesson = lessonsService.getLessont(id);
        model.addAttribute("lesson", lesson);
        return "lessonPage";
    }
}

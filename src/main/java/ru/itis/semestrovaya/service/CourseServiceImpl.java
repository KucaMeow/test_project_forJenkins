package ru.itis.semestrovaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.itis.semestrovaya.config.security.details.UserDetailsImpl;
import ru.itis.semestrovaya.model.Course;
import ru.itis.semestrovaya.model.Lesson;
import ru.itis.semestrovaya.repository.CousresRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CoursesService {

    @Autowired
    CousresRepository cousresRepository;
    @Override
    public List<Course> getAllCourses() {
        return cousresRepository.findAll();
    }

    @Override
    public Course getCourse(long id) {
        Optional<Course> courseOptional = cousresRepository.findById(id);
        return courseOptional.orElse(null);
    }

    @Override
    public Course createEmptyCourse() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = ((UserDetailsImpl) authentication.getPrincipal()).getUsername();
        Course newCourse = Course.builder()
                .author(email)
                .description("Empty description")
                .name("New course")
                .lessons(new ArrayList<>())
                .build();
        cousresRepository.save(newCourse);
        return newCourse;
    }

    @Override
    public void updateCourseById(long id, String name, String description) {
        Course course = cousresRepository.findById(id).orElse(null);
        if(course == null)
            return;
        course.setName(name);
        course.setDescription(description);
        cousresRepository.save(course);
    }

    @Override
    public Course getIdOfMostRelevantCourse() {
        List<Course> courses = getAllCourses();
        Course mcourse = null;
        int most = 0;
        for(Course course : courses) {
            int temp = 0;
            for(Lesson lesson : course.getLessons()) {
                temp += lesson.getCourseModules().size();
            }
            if(temp > most) {
                most = temp;
                mcourse = course;
            }
        }
        return mcourse;
    }
}

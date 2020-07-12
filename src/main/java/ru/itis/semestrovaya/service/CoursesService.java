package ru.itis.semestrovaya.service;

import ru.itis.semestrovaya.model.Course;

import java.util.List;

public interface CoursesService {
    List<Course> getAllCourses();

    Course getCourse(long id);

    Course createEmptyCourse();

    void updateCourseById(long id, String name, String description);

    Course getIdOfMostRelevantCourse();
}

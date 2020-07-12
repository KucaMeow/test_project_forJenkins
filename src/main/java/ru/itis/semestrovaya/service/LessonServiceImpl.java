package ru.itis.semestrovaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.semestrovaya.model.Course;
import ru.itis.semestrovaya.model.Lesson;
import ru.itis.semestrovaya.repository.CousresRepository;
import ru.itis.semestrovaya.repository.LessonsRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonsService {

    @Autowired
    LessonsRepository lessonsRepository;
    @Autowired
    CousresRepository cousresRepository;

    @Override
    public Lesson getLessont(long id) {
        Optional<Lesson> lessonOptional = lessonsRepository.findById(id);
        return lessonOptional.orElse(null);
    }

    @Override
    public Lesson addLessonToCourse(long courseId) {
        Course course = cousresRepository.findById(courseId).get();
        Lesson lesson = Lesson.builder()
                .orderNumber(course.getLessons().size())
                .course(course)
                .courseModules(new ArrayList<>())
                .build();
        lessonsRepository.save(lesson);
        return lesson;
    }
}

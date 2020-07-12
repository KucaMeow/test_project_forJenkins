package ru.itis.semestrovaya.service;

import ru.itis.semestrovaya.model.Lesson;

public interface LessonsService {
    Lesson getLessont(long id);

    Lesson addLessonToCourse(long courseId);
}

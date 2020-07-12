package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.Lesson;

public interface LessonsRepository extends JpaRepository<Lesson, Long> {
}

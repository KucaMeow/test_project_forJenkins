package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.Course;

public interface CousresRepository extends JpaRepository<Course, Long> {
}

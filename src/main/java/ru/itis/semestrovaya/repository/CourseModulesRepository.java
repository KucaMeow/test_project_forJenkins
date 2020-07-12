package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.CourseModule;

public interface CourseModulesRepository extends JpaRepository<CourseModule, Long> {
}

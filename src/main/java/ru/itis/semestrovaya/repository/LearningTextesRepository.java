package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.LearningText;

public interface LearningTextesRepository extends JpaRepository<LearningText, Long> {
}

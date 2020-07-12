package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.CodeTask;

public interface CodeTasksRepository extends JpaRepository<CodeTask, Long> {
}

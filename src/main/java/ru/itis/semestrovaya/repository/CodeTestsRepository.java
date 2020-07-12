package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.CodeTask;
import ru.itis.semestrovaya.model.CodeTest;

import java.util.List;
import java.util.Optional;

public interface CodeTestsRepository extends JpaRepository<CodeTest, Long> {
    void deleteAllByCodeTask(CodeTask codeTask);
}

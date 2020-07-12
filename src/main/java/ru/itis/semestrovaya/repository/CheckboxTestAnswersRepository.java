package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.CheckboxTest;
import ru.itis.semestrovaya.model.CheckboxTestAnswer;

public interface CheckboxTestAnswersRepository extends JpaRepository<CheckboxTestAnswer, Long> {
    void deleteAllByCheckboxTest(CheckboxTest checkboxTest);
}

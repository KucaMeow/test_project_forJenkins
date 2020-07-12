package ru.itis.semestrovaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.semestrovaya.model.CheckboxTest;

public interface CheckboxTestsRepository extends JpaRepository<CheckboxTest, Long> {
}

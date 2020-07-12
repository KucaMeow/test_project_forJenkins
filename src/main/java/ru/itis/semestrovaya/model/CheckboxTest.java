package ru.itis.semestrovaya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckboxTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Lob
    String question;
    @Lob
    String correctAnswer;
    @OneToMany(mappedBy = "checkboxTest", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<CheckboxTestAnswer> checkboxTestAnswers;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "couserModuleId", nullable = true)
    @JsonIgnore
    CourseModule courseModule;

    public List<CheckboxTestAnswer> getCheckboxTestAnswers() {
        Collections.shuffle(checkboxTestAnswers);
        return checkboxTestAnswers;
    }
}

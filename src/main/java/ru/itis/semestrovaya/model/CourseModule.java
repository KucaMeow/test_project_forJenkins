package ru.itis.semestrovaya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "module")
public class CourseModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int orderNumber;
    @Enumerated(EnumType.STRING)
    ModuleType moduleType;
    @OneToOne(mappedBy = "courseModule", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    CodeTask codeTask;
    @OneToOne(mappedBy = "courseModule", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    LearningText learningText;
    @OneToOne(mappedBy = "courseModule", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    CheckboxTest checkboxTest;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_id")
    @JsonIgnore
    Lesson lesson;
}

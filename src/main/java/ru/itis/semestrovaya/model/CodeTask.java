package ru.itis.semestrovaya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CodeTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Lob
    String text;
    @OneToMany(mappedBy = "codeTask", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<CodeTest> tests;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "couserModuleId", nullable = true)
    @JsonIgnore
    CourseModule courseModule;
}

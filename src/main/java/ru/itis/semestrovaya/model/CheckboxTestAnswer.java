package ru.itis.semestrovaya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CheckboxTestAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Lob
    String answer;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "checkboxTestId")
    @JsonIgnore
    CheckboxTest checkboxTest;
}

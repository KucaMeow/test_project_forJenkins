package ru.itis.semestrovaya.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto {
    @Email(message = "Incorrect email")
    String email;
    @Pattern(regexp = "^[a-zA-Z]\\\\w{3,14}$", message = "Incorrect password")
    String password;
}

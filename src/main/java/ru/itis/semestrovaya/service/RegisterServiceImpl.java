package ru.itis.semestrovaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.semestrovaya.dto.RegisterDto;
import ru.itis.semestrovaya.model.Role;
import ru.itis.semestrovaya.model.State;
import ru.itis.semestrovaya.model.User;
import ru.itis.semestrovaya.repository.UsersRepository;

@Component
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UsersRepository usersRepository;

    @Override
    public boolean saveUser (RegisterDto user) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            usersRepository.save(User
                    .builder()
                    .email(user.getEmail())
                    .password(user.getPassword())
                    .role(Role.ROLE_USER)
                    .state(State.CONFIRMED)
                    .build());
            return true;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }


}

package ru.itis.semestrovaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;
import ru.itis.semestrovaya.container.SessionUserContainer;
import ru.itis.semestrovaya.model.Role;
import ru.itis.semestrovaya.model.State;
import ru.itis.semestrovaya.model.User;
import ru.itis.semestrovaya.repository.UsersRepository;

@Service
public class FacebookConnectionSignUp implements ConnectionSignUp {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private SessionUserContainer sessionUserContainer;

    @Override
    public String execute(Connection<?> connection) {
        User user = User.builder()
                .email(connection.getDisplayName())
                .password(connection.getDisplayName() + "asdsad")
                .state(State.CONFIRMED)
                .role(Role.ROLE_USER)
                .build();
        if(!usersRepository.findUserByEmail(user.getEmail()).isPresent()) {
            usersRepository.save(user);
        } else {
            user = usersRepository.findUserByEmail(connection.getDisplayName()).get();
        }
        sessionUserContainer.setUser(user);
        return user.getEmail();
    }
}
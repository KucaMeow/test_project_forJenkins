package ru.itis.semestrovaya.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Scope("user")
@Component
public class UserIdContainer {

    Long userId;
    String user_UUID;

    public UserIdContainer(@Autowired SessionUserContainer sessionUserContainer) {
        userId = sessionUserContainer.getUser().getId();
        user_UUID = UUID.randomUUID().toString();
    }

    public Long getUserId() {
        return userId;
    }

    public String getUser_UUID() {
        return user_UUID;
    }
}

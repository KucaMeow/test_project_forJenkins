package ru.itis.semestrovaya.container;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ru.itis.semestrovaya.model.User;

@Data
@Component
@SessionScope
public class SessionUserContainer {
    User user;
}

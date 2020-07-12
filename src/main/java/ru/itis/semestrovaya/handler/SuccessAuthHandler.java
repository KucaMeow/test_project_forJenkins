package ru.itis.semestrovaya.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import ru.itis.semestrovaya.config.security.details.UserDetailsImpl;
import ru.itis.semestrovaya.container.SessionUserContainer;
import ru.itis.semestrovaya.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SuccessAuthHandler implements AuthenticationSuccessHandler {

    @Autowired
    SessionUserContainer sessionUserContainer;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        User user = ((UserDetailsImpl) authentication.getPrincipal()).getUser();
        sessionUserContainer.setUser(user);
    }
}

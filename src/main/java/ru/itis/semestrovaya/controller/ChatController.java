package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.semestrovaya.container.SessionUserContainer;

@Controller
public class ChatController {

    @Autowired
    SessionUserContainer sessionUserContainer;

    @RequestMapping("/chat")
    @PreAuthorize("isAuthenticated()")
    public String getChat(Model model) {
        model.addAttribute("email", sessionUserContainer.getUser().getEmail());
        return "chat";
    }
}

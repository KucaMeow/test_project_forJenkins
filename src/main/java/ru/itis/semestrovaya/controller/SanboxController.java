package ru.itis.semestrovaya.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SanboxController {

    @RequestMapping("/sandbox")
    @PreAuthorize("hasAuthority(\"ROLE_ADMIN\")")
    public ModelAndView getPage() {
        return new ModelAndView("sandbox");
    }
}

package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.semestrovaya.dto.RegisterDto;
import ru.itis.semestrovaya.service.RegisterService;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("form", RegisterDto.builder()
                .email("")
                .password("")
                .build());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String  registerUser(RegisterDto user, BindingResult bindingResult, Model model) {
        if(registerService.saveUser(user) && bindingResult.getAllErrors().isEmpty()) {
            return "login";
        }
        else {
            model.addAttribute("form", user);
            return "register";
        }
    }
}

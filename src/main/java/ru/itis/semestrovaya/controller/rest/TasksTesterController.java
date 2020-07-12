package ru.itis.semestrovaya.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.semestrovaya.dto.ProgramResult;
import ru.itis.semestrovaya.dto.ResultDto;
import ru.itis.semestrovaya.service.CodeExecuteService;

import java.util.Scanner;

@RestController
public class TasksTesterController {

    @Autowired
    CodeExecuteService codeExecuteService;

    @PostMapping("/rest/execute")
    public ProgramResult handleProgram(@RequestParam("code") String code) {
        return codeExecuteService.executeProgram(code);
    }

    @PostMapping("/rest/code-test/{id}")
    public ResultDto testCodeTest(@PathVariable long id, @RequestParam String code) {
        return codeExecuteService.test(id, code);
    }

    @PostMapping("/rest/checkbox-test/{id}")
    public ResultDto checkCheckboxAnswer(@PathVariable long id, @RequestParam String answer) {
        return codeExecuteService.checkAnswerForCheckbox(id, answer);
    }
}

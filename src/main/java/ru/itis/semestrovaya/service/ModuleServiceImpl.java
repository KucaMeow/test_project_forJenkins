package ru.itis.semestrovaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.semestrovaya.model.*;
import ru.itis.semestrovaya.repository.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    CourseModulesRepository courseModulesRepository;
    @Autowired
    LessonsRepository lessonsRepository;
    @Autowired
    LearningTextesRepository learningTextesRepository;
    @Autowired
    CheckboxTestsRepository checkboxTestsRepository;
    @Autowired
    CodeTasksRepository codeTasksRepository;
    @Autowired
    CheckboxTestAnswersRepository checkboxTestAnswersRepository;
    @Autowired
    CodeTestsRepository codeTestsRepository;

    @Override
    public CourseModule getCouseModule(long id) {
        return courseModulesRepository.findById(id).orElse(null);
    }

    @Override
    public CourseModule addTextLessonToLesson(long lessonId) {
        Lesson lesson = lessonsRepository.findById(lessonId).get();
        LearningText learningText = LearningText.builder().build();
        CourseModule courseModule = CourseModule.builder()
                .moduleType(ModuleType.LearningText)
                .orderNumber(lesson.getCourseModules().size())
                .lesson(lesson)
                .build();
        learningText.setCourseModule(courseModule);
        learningText.setText("Default text");
        courseModulesRepository.save(courseModule);
        courseModule.setLearningText(learningText);
        learningTextesRepository.save(learningText);
        return courseModule;
    }

    @Override
    public CourseModule addCheckboxTestToLesson(long lessonId) {
        Lesson lesson = lessonsRepository.findById(lessonId).get();
        CheckboxTest checkboxTest = CheckboxTest.builder().build();
        CourseModule courseModule = CourseModule.builder()
                .moduleType(ModuleType.CheckboxTest)
                .orderNumber(lesson.getCourseModules().size())
                .lesson(lesson)
                .build();
        checkboxTest.setCourseModule(courseModule);
        checkboxTest.setQuestion("Default question");
        checkboxTest.setCorrectAnswer("No answers yet");
        checkboxTest.setCheckboxTestAnswers(new ArrayList<>());
        courseModulesRepository.save(courseModule);
        courseModule.setCheckboxTest(checkboxTest);
        checkboxTestsRepository.save(checkboxTest);
        return courseModule;
    }

    @Override
    public CourseModule addCodeTaskToLesson(long lessonId) {
        Lesson lesson = lessonsRepository.findById(lessonId).get();
        CodeTask codeTask = CodeTask.builder().build();
        CourseModule courseModule = CourseModule.builder()
                .moduleType(ModuleType.CodeTask)
                .orderNumber(lesson.getCourseModules().size())
                .lesson(lesson)
                .build();
        codeTask.setCourseModule(courseModule);
        codeTask.setText("Default question");
        codeTask.setTests(new ArrayList<>());
        courseModulesRepository.save(courseModule);
        courseModule.setCodeTask(codeTask);
        codeTasksRepository.save(codeTask);
        return courseModule;
    }

    @Override
    public Long updateLearningText(long id, String text) {
        LearningText learningText = learningTextesRepository.findById(id).get();
        learningText.setText(text);
        learningTextesRepository.save(learningText);
        return learningText.getCourseModule().getLesson().getId();
    }

    @Override
    @Transactional
    public Long updateCheckboxTest(long id, String question, String[] answers, String correctAnswer) {
        CheckboxTest checkboxTest = checkboxTestsRepository.findById(id).get();
        checkboxTest.getCheckboxTestAnswers().clear();
        checkboxTestAnswersRepository.deleteAllByCheckboxTest(checkboxTest);
        checkboxTestAnswersRepository.flush();
        checkboxTest.setQuestion(question);
        checkboxTest.setCorrectAnswer(correctAnswer);
        List<CheckboxTestAnswer> checkboxTestAnswers = new ArrayList<>();
        for(String newAnswer : answers) {
            CheckboxTestAnswer newTestAnswer = CheckboxTestAnswer.builder()
                    .answer(newAnswer)
                    .checkboxTest(checkboxTest)
                    .build();
            checkboxTestAnswersRepository.save(newTestAnswer);
            checkboxTestAnswers.add(newTestAnswer);
        }
        checkboxTest.setCheckboxTestAnswers(checkboxTestAnswers);
        checkboxTestsRepository.save(checkboxTest);
        return checkboxTest.getCourseModule().getLesson().getId();
    }

    @Override
    @Transactional
    public Long updateCodeTask(long id, String[] inputs, String[] outputs, String text) {
        CodeTask codeTask = codeTasksRepository.findById(id).get();
        codeTask.getTests().clear();
        codeTestsRepository.deleteAllByCodeTask(codeTask);
        codeTestsRepository.flush();
        codeTask.setText(text);
        List<CodeTest> codeTests = new ArrayList<>();
        for(int i = 0; i < inputs.length; i++) {
            CodeTest codeTest = CodeTest.builder()
                    .codeTask(codeTask)
                    .input(inputs[i])
                    .output(outputs[i])
                    .build();
            codeTestsRepository.save(codeTest);
            codeTests.add(codeTest);
        }
        codeTask.setTests(codeTests);
        codeTasksRepository.save(codeTask);
        return codeTask.getCourseModule().getLesson().getId();
    }
}

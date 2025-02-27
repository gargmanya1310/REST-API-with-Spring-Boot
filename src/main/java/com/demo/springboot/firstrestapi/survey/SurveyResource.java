package com.demo.springboot.firstrestapi.survey;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class SurveyResource
{
    private SurveyService surveyService;

    public SurveyResource(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @RequestMapping("/surveys")
    public List<Survey> retriveAllSurveys()
    {
        return surveyService.retrieveAllSurveys();
    }

    @RequestMapping("/surveys/{surveyId}")
    public Survey retrieveSurveyById(@PathVariable String surveyId){
        Survey survey = surveyService.retrieveSurveyById(surveyId);

        if(survey==null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return survey;
    }
    @RequestMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveAllSurveyQuestions(@PathVariable String surveyId){
        List<Question>questions = surveyService.retrieveAllSurveyQuestions(surveyId);

        if(questions==null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return questions;
    }

    @RequestMapping("/surveys/{surveyId}/questions/{questionId}")
    public Question retrieveSpecificSurveyQuestion(@PathVariable String surveyId,
                                                   @PathVariable String questionId){
        Question question = surveyService.retrieveSpecificSurveyQuestion
                (surveyId, questionId);

        if(question==null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return question;
    }

    @RequestMapping(value="/surveys/{surveyId}/questions", method = RequestMethod.POST)
    public void addNewSurveyQuestion(@PathVariable String surveyId,
                                     @RequestBody Question question){

        surveyService.addNewSurveyQuestion(surveyId, question);

    }

}

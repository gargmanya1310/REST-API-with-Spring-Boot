package com.demo.springboot.firstrestapi.survey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question
{
    private String id;
    private String description;
    private List<String> options;
    private String correctAnswer;
}

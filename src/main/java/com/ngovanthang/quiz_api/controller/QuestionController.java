package com.ngovanthang.quiz_api.controller;

import com.ngovanthang.quiz_api.constaint.DoKho;
import com.ngovanthang.quiz_api.constaint.TypeQuestion;
import com.ngovanthang.quiz_api.dto.category.CategoryDTO;
import com.ngovanthang.quiz_api.dto.question.QuestionDTO;
import com.ngovanthang.quiz_api.entity.Category;
import com.ngovanthang.quiz_api.entity.Question;
import com.ngovanthang.quiz_api.repository.CategoryRepository;
import com.ngovanthang.quiz_api.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/question")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping()
    @Transactional
    public Question save(@RequestBody QuestionDTO questionDTO){
        Question question = new Question();
        question.setTypeQuestion(questionDTO.getTypeQuestion());
        question.setDoKho(questionDTO.getDoKho());
        question.setTitle(questionDTO.getTitle());
        Category category = categoryRepository.findById(questionDTO.getCategoryId()).get();
        question.setCategory(category);
        return questionRepository.save(question);
    }

    @GetMapping()
    @Transactional
    public List get(@RequestParam(required = false)DoKho doKho,
                    @RequestParam(required = false)TypeQuestion typeQuestion,
                    @RequestParam(required = false) Long categoryId
    ){

        return questionRepository.findAll();
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable long id
    ){
        Question question = questionRepository.findById(id).get();
        questionRepository.delete(question);
    }
}

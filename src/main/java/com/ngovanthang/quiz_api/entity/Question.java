package com.ngovanthang.quiz_api.entity;

import com.ngovanthang.quiz_api.constaint.DoKho;
import com.ngovanthang.quiz_api.constaint.TypeQuestion;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "question")
public class Question{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private DoKho doKho;
    private TypeQuestion typeQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", foreignKey = @ForeignKey(name = "FK_question_category"))
    private Category category;

//    private String answer1;
//    private String answer2;
//    private String answer3;
//    private String answer4;
//    private Integer correct_answer;

}

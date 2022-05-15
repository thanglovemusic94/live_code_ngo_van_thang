package com.ngovanthang.quiz_api.dto.question;


import com.ngovanthang.quiz_api.constaint.DoKho;
import com.ngovanthang.quiz_api.constaint.TypeQuestion;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class QuestionDTO {
    private String title;
    private DoKho doKho;
    private TypeQuestion typeQuestion;
    private Long categoryId;


}

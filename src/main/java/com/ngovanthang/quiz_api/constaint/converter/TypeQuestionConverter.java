package com.ngovanthang.quiz_api.constaint.converter;

import com.ngovanthang.quiz_api.constaint.DoKho;
import com.ngovanthang.quiz_api.constaint.TypeQuestion;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TypeQuestionConverter implements AttributeConverter<TypeQuestion, Integer> {
    @Override
    public Integer convertToDatabaseColumn(TypeQuestion type) {
        if (type == null)
            return null;
        return type.getCode();
    }

    @Override
    public TypeQuestion convertToEntityAttribute(Integer code) {
        if (code == null)
            return null;

        return TypeQuestion.valueOf(code);
    }
}
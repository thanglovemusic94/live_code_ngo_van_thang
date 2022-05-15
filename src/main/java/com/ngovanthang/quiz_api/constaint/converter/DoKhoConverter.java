package com.ngovanthang.quiz_api.constaint.converter;

import com.ngovanthang.quiz_api.constaint.DoKho;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DoKhoConverter implements AttributeConverter<DoKho, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DoKho type) {
        if (type == null)
            return null;
        return type.getCode();
    }

    @Override
    public DoKho convertToEntityAttribute(Integer code) {
        if (code == null)
            return null;

        return DoKho.valueOf(code);
    }
}



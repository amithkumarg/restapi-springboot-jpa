package com.oss.shop.converter;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

//only required for JPA 2.1 or lower
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate date) {        
        return Date.valueOf(date);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date value) {
        return value.toLocalDate();
    }
}

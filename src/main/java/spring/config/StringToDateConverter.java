package spring.config;

import org.springframework.core.convert.converter.Converter;

import java.sql.Date;
import java.time.LocalDate;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        try {
            LocalDate localDate = LocalDate.parse(source);
            return Date.valueOf(localDate);
        } catch (Exception e) {
            // Gérer les exceptions de conversion ici
            return null;
        }
    }
}


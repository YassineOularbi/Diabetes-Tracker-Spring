package spring.config;

import org.springframework.core.convert.converter.Converter;

import java.sql.Time;
import java.time.LocalTime;

public class StringToTimeConverter implements Converter<String, Time> {

    @Override
    public Time convert(String source) {
        try {
            LocalTime localTime = LocalTime.parse(source);
            return Time.valueOf(localTime);
        } catch (Exception e) {
            // Gérer les exceptions de conversion ici
            return null;
        }
    }
}


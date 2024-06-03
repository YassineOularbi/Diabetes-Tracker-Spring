package spring.service;

import spring.entity.Diabetes;
import spring.exception.ResourceNotFoundException;

import java.util.List;



public interface DiabetesService {

    List<Diabetes> getAll();

    void save(Diabetes student);

    Diabetes getById(Long id) throws ResourceNotFoundException;

    void delete(Long id);

}
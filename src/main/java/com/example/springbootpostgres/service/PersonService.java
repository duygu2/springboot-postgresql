package com.example.springbootpostgres.service;

import com.example.springbootpostgres.model.Person;
import com.example.springbootpostgres.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo personRepo;
    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> listPerson() {
        return personRepo.findAll();
    }

    public Optional<Person> getByIdPerson(Long id) {
        return personRepo.findById(id);
    }

    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }
}

package com.example.springbootpostgres.controller;

import com.example.springbootpostgres.model.Person;
import com.example.springbootpostgres.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<Person> add(@RequestBody Person person){
        return ResponseEntity.ok(personService.addPerson(person));
    }
    @GetMapping
    public ResponseEntity<List<Person>> listPerson(){
        return ResponseEntity.ok(personService.listPerson());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> getByIdPerson(@PathVariable Long id){
        return ResponseEntity.ok(personService.getByIdPerson(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return ResponseEntity.ok().build();
    }
}

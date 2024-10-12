package com.hexar.springhibernate.controller;

import com.hexar.springhibernate.model.Person;
import com.hexar.springhibernate.repository.PersonRepository;
import com.hexar.springhibernate.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private HelpService helpService;

    @GetMapping
    public List<Person> getAllPersons() {
        System.out.println("vypis ");
        List<Person> persons = personRepository.findAll();
        // Zavolání metody, která vypíše počet osob do konzole
        helpService.printPersonCount(persons);
        return persons;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}



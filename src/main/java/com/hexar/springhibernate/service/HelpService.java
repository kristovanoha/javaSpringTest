package com.hexar.springhibernate.service;


import com.hexar.springhibernate.model.Person;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HelpService {


    // Metoda pro spočítání počtu osob a jejich vypsání do konzole
    public void printPersonCount(List<Person> persons) {
        // Získání počtu osob
        int count = persons.size();

        // Vypsání počtu do konzole
        System.out.println("Počet osob: " + count);
    }

}

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

 //treti hexarus zmena  OPRAVA   feature 5 s
  // novinka na pul request
         //dev test test  a1 a2 a3 a4  Pull request

        System.out.println("Počet osob: " + count);
    }

}

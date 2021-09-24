package com.webatrio.test.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webatrio.test.model.Person;
import com.webatrio.test.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Iterable<Person> getPeople() {
    	List<Person> result = new LinkedList<Person>();
    	personRepository.findAll().forEach(result::add);
    	
    	Collections.sort(result, Person.Comparators.lastName);
        
        return personRepository.findAll();
    }

    public Person savePerson(Person person) {
    	Person savedPerson = personRepository.save(person);
        return savedPerson;
    }
}

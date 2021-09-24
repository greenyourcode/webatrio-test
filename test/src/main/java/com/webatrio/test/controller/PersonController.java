package com.webatrio.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webatrio.test.model.Person;
import com.webatrio.test.service.PersonService;

@RestController
@RequestMapping(path = "/api")
public class PersonController {
	@Autowired
    private PersonService personService;

    @GetMapping("/people")
    public Iterable<Person> getPeople() {
        return personService.getPeople();
    }
	
	@PostMapping("/people")
	public Person addPerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
}
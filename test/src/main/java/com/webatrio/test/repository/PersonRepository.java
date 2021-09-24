package com.webatrio.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webatrio.test.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}

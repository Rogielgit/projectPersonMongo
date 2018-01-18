package com.person.repository;

import com.person.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonRepository extends MongoRepository<Person, String> {

}

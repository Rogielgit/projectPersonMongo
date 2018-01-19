package com.person.service;

import com.person.model.Person;
import com.person.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService implements IPersonService{

    @Autowired
    private IPersonRepository personRepository;

    @Override
    public void createPerson(Person p) {
        personRepository.save(p);
    }

    @Override
    public void updatePerson(Person p) {
        personRepository.save(p);
    }

    @Override
    public void deletePerson(String id) {
        personRepository.delete(id);
    }

    @Override
    public List<Person> listPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person findPersonById(String id) {
        return personRepository.findOne(id);
    }
}

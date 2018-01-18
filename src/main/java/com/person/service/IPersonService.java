package com.person.service;

import com.person.model.Person;

import java.util.List;

public interface IPersonService {

    public void createPerson(Person p);
    public void updatePerson(Person p);
    public void deletePerson(String id);
    public List<Person> listPerson();
    public Person findPersonById(String id);
}

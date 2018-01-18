package com.person.controller;

import com.person.model.Person;
import com.person.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createPerson(@RequestBody Person p) {
        personService.createPerson(p);
    }

    @GetMapping
    @ResponseStatus(OK)
    public @ResponseBody
    List<Person> listPersons() {
        return personService.listPerson();
    }

    @GetMapping("/{id}")
    public @ResponseBody Person findPersonById(@PathVariable ("id") String id ) {
       return personService.findPersonById(id);
    }

    @PutMapping()
    @ResponseStatus(OK)
    public void updatePerson(@RequestBody Person p) {
       personService.updatePerson(p);
    }

    @ResponseStatus(OK)
    @DeleteMapping
    public void deletePerson(@RequestParam (value = "id") String id) {
        personService.deletePerson(id);
    }
}

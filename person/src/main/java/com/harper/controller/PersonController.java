package com.harper.controller;

import com.harper.dao.PersonRepositry;
import com.harper.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepositry personRepositry;

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName){
        Person person = new Person(personName);
        personRepositry.save(person);
        List<Person> persons = personRepositry.findAll(new PageRequest(0, 10)).getContent();
        return persons;
    }
}

package com.ivoronline.springboot_db_findermethods_projections.controllers;

import com.ivoronline.springboot_db_findermethods_projections.entities.Person;
import com.ivoronline.springboot_db_findermethods_projections.entities.PersonView;
import com.ivoronline.springboot_db_findermethods_projections.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND PERSONS BY NAME (Multiple Entities)
  //================================================================
  @RequestMapping("FindPersonViewByName")
  PersonView findByName() {
    PersonView personView = personRepository.findPersonViewByName("Bill");
    System.out.println(personView);
    return personView;
  }

  //================================================================
  // FIND PERSONS BY NAME (Multiple Entities)
  //=============================================================
  @RequestMapping("FindPersonByName")
  Person findPersonByName() {
    Person person = personRepository.findPersonByName("Bill");
    return person;
  }

}

package com.ivoronline.springboot_db_findermethods_projections.controllers;

import com.ivoronline.springboot_db_findermethods_projections.entities.PersonProjection;
import com.ivoronline.springboot_db_findermethods_projections.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND PERSON PROJECTION BY NAME
  //================================================================
  @RequestMapping("FindPersonProjectionByName")
  PersonProjection findPersonProjectionByName() {
    PersonProjection personProjection = personRepository.findPersonProjectionByName("Bill");
    return personProjection;
  }

}

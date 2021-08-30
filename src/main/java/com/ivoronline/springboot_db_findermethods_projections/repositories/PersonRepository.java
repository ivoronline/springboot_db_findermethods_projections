package com.ivoronline.springboot_db_findermethods_projections.repositories;

import com.ivoronline.springboot_db_findermethods_projections.entities.Person;
import com.ivoronline.springboot_db_findermethods_projections.entities.PersonView;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Person     findPersonByName    (String name);
  PersonView findPersonViewByName(String name);
}



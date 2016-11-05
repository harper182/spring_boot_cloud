package com.harper.dao;

import com.harper.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepositry extends JpaRepository<Person,Long>{

}

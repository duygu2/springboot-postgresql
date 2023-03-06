package com.example.springbootpostgres.repo;

import com.example.springbootpostgres.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}

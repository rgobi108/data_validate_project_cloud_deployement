package com.cloud.data_validate.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.data_validate.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
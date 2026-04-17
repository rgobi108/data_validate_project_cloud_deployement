package com.cloud.data_validate.service;




import org.springframework.stereotype.Service;

import com.cloud.data_validate.entity.Person;
import com.cloud.data_validate.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public Person add(String name) {
        Person p = new Person();
        p.setName(name);
        return repo.save(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<Person> getAll() {
        return repo.findAll();
    }
}
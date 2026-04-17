package com.cloud.data_validate.controller;






import org.springframework.web.bind.annotation.*;

import com.cloud.data_validate.entity.Person;
import com.cloud.data_validate.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin(origins = "*")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public Person add(@RequestBody Person p) {
        return service.add(p.getName());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<Person> getAll() {
        return service.getAll();
    }
}
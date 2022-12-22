package medved.java.spring_hibernate_person.controller;

import lombok.AllArgsConstructor;
import medved.java.spring_hibernate_person.entity.Persons;
import medved.java.spring_hibernate_person.repository.PersonsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class HibernatePersonController {
    private PersonsRepository repository;

    public HibernatePersonController(PersonsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/by-city")
    public List<Persons> getPersonsById(@RequestParam("city_of_living") String city){
        return repository.getPersonsById(city);
    }
}

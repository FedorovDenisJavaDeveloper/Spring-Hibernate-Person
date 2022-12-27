package medved.java.spring_hibernate_person.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import medved.java.spring_hibernate_person.entity.BasePerson;
import medved.java.spring_hibernate_person.entity.Persons;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager manager;

    public List<Persons> getPersonsByCity(String city) {
        Query query = manager.createQuery("select p from Persons p where p.city= :city", Persons.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}

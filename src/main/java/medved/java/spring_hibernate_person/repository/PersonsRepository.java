package medved.java.spring_hibernate_person.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import medved.java.spring_hibernate_person.entity.BasePerson;
import medved.java.spring_hibernate_person.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons,BasePerson> {
    List<Persons> findPersonsByCityOfLiving(@Param(value = "city_of_living")String city);
    List<Persons> findPersonsByBasePersonAgeLessThanOrderByBasePersonAgeAsc(int age);
//    List<BasePerson> findBasePersonByBasePersonAgeLessThanOrderByBasePersonAgeDesc(int age);
//    List<String> findPhoneNumberByBasePersonAgeLessThan(int age);
    List<Optional<Persons>> findPersonsByBasePersonNameAndBasePersonSurname(String name, String surname);
}

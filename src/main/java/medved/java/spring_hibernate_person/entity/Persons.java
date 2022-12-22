package medved.java.spring_hibernate_person.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persons {
    @EmbeddedId
    private BasePerson basePerson;
    private String phone_number;
    private String city_of_living;
}

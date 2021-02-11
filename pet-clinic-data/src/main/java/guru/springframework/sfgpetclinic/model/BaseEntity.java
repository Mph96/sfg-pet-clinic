package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

//Establishes as the base class of the JPA. Other classes are inheriting from this class
//Won't be mapped to the database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    // Long is able to be null
    @Id
    //Identity ties you to the specific database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}

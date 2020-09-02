package in.avenues.customermodule.customer;

import in.avenues.customermodule.config.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends Auditable<String> {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String LastName;
    private String email;
    private String mobileNo;

    private boolean isActive = true;
}

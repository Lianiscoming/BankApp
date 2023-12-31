package portfolio.bankapp.bankapp.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import portfolio.bankapp.bankapp.common.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String grade;
    private int age;
    private String email;
    private String organization;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

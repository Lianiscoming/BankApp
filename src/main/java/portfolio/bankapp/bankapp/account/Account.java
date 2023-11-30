package portfolio.bankapp.bankapp.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import portfolio.bankapp.bankapp.common.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Account extends BaseEntity {

    @Id
    private String number;
    private String type;
    private long balance; //BigDecimal
    private String password;
    private int employeeId;
    private int customerId;
}

package portfolio.bankapp.bankapp.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import portfolio.bankapp.bankapp.common.entity.BaseEntity;

@Entity
public class Transaction extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long balance;
    private String type;
    private long balanceAfterTransaction;
    private String accountNumber;

}

package portfolio.bankapp.bankapp.customer.exception;

import portfolio.bankapp.bankapp.common.exception.BaseException;

public class CustomerNotFoundException extends CustomerException {
    public CustomerNotFoundException(long id, String name) {
        super(id, name);
    }
}

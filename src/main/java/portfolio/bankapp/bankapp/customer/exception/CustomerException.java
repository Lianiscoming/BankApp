package portfolio.bankapp.bankapp.customer.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import portfolio.bankapp.bankapp.common.exception.BaseException;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
    private final long id;
    private final String name;
}

package DZ2;

import DZ1.InvalidNumberException;

public class DivisionByZeroException extends InvalidNumberException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

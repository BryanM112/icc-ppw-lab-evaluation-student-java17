package ec.edu.ups.icc.libraryevaluation.core.exceptions.domain;

import org.springframework.http.HttpStatus;
import ec.edu.ups.icc.libraryevaluation.core.exceptions.base.ApplicationException;

public class BadRequestException extends ApplicationException {
    public BadRequestException(String code, String message) {
        super(HttpStatus.BAD_REQUEST, code, message);
    }

    public BadRequestException(String message) {
        this("BAD_REQUEST", message);
    }
}

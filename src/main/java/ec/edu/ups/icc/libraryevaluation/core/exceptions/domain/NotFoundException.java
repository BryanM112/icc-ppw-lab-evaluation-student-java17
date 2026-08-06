package ec.edu.ups.icc.libraryevaluation.core.exceptions.domain;

import org.springframework.http.HttpStatus;
import ec.edu.ups.icc.libraryevaluation.core.exceptions.base.ApplicationException;

public class NotFoundException extends ApplicationException {
    public NotFoundException(String code, String message) {
        super(HttpStatus.NOT_FOUND, code, message);
    }

    public NotFoundException(String message) {
        this("RESOURCE_NOT_FOUND", message);
    }
}

package ec.edu.ups.icc.libraryevaluation.books.exceptions;

            import org.springframework.http.HttpStatus;
            import ec.edu.ups.icc.libraryevaluation.core.exceptions.base.ApplicationException;

            public class BookConflictException extends ApplicationException {
            public BookConflictException(String message) {
            super(HttpStatus.CONFLICT, "BOOK_CONFLICT", message);
            }
            }


            
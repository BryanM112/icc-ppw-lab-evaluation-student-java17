package ec.edu.ups.icc.libraryevaluation.books.services;

import java.util.List;

import ec.edu.ups.icc.libraryevaluation.books.dtos.BookResponseDto;

public interface BookService {
  List<BookResponseDto> findByCopies(Integer copies);

  List<BookResponseDto> findByLowStock(Integer copies);
}

package ec.edu.ups.icc.libraryevaluation.books.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.ups.icc.libraryevaluation.books.dtos.BookResponseDto;
import ec.edu.ups.icc.libraryevaluation.books.mappers.BookMapper;
import ec.edu.ups.icc.libraryevaluation.books.repositories.BookRepository;
import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class BookServiceImpl implements BookService{
  private final BookMapper bookMapper;
  private final BookRepository bookRepository;

  

  public BookServiceImpl(BookMapper bookMapper, BookRepository bookRepository) {
    this.bookMapper = bookMapper;
    this.bookRepository = bookRepository;
  }



  @Override
  @Transactional(readOnly = true)
  public List<BookResponseDto> findByCopies(Integer copies) {
    List<BookResponseDto> data = bookRepository.findByCopiesAvailableGreaterThanEqualAndActiveTrueAndDeletedFalseOrderByTitleAsc(copies).stream().map(bookMapper::toResponse).toList();
    return data;
  }



  @Override
  public List<BookResponseDto> findByLowStock(Integer copies) {
    List<BookResponseDto> data = bookRepository.findByCopiesAvailableLessThanAndActiveTrueAndDeletedFalseOrderByCopiesAvailableAsc(copies).stream().map(bookMapper::toResponse).toList();
    return data;
  }
  
}

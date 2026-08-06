package ec.edu.ups.icc.libraryevaluation.books.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.ups.icc.libraryevaluation.books.dtos.BookResponseDto;
import ec.edu.ups.icc.libraryevaluation.books.services.BookService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/books")
@Tag(name = "Books", description = "libros")
public class BookController {
  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/catalog")
  public ResponseEntity<List<BookResponseDto>> findByCatalogo(@RequestParam(defaultValue = "4") Integer minCopies){
    List<BookResponseDto> response = bookService.findByCopies(minCopies);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/low-stock")
  public ResponseEntity<List<BookResponseDto>> findByLowStock(@RequestParam(defaultValue = "4") Integer maxCopies){
    List<BookResponseDto> response = bookService.findByLowStock(maxCopies);
    return ResponseEntity.ok(response);
  }
  
}

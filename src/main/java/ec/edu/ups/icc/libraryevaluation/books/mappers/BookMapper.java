package ec.edu.ups.icc.libraryevaluation.books.mappers;

import org.springframework.stereotype.Component;

import ec.edu.ups.icc.libraryevaluation.books.dtos.BookResponseDto;
import ec.edu.ups.icc.libraryevaluation.books.entities.BookEntity;

@Component
public class BookMapper {
  public BookResponseDto toResponse(BookEntity entity){
    return new BookResponseDto(entity.getId(), entity.getIsbn(), entity.getTitle(), entity.getAuthor(), entity.getCategory(), entity.getCopiesAvailable(), entity.getPrice(), entity.isActive());
  }
}

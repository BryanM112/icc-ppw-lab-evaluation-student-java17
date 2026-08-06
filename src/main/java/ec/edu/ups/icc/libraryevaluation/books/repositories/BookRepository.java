package ec.edu.ups.icc.libraryevaluation.books.repositories;

import java.util.List;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.ups.icc.libraryevaluation.books.entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{
  List<BookEntity> findByCopiesAvailableGreaterThanEqualAndActiveTrueAndDeletedFalseOrderByTitleAsc(Integer minCopies);

  List<BookEntity> findByCopiesAvailableLessThanAndActiveTrueAndDeletedFalseOrderByCopiesAvailableAsc(Integer maxCopies);

  
  
  
}

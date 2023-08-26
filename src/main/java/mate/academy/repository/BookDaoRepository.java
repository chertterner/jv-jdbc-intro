package mate.academy.repository;

import java.util.List;
import java.util.Optional;
import mate.academy.model.Book;

public interface BookDaoRepository {
    Book create(Book book);

    Optional<Book> findById(Long id);

    List<Book> findAll();

    Book update(Book book);

    boolean deleteById(Long id);
}

package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

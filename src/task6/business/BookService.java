package task6.business;

import task6.domain.Book;
import java.util.List;

public interface BookService {
    void addBook(String title, String author, double price);
    void removeBook(String title, String author, double price);
    List<Book> getAllBooks();
}

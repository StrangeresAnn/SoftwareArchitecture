package task6.presentation;

import task6.business.BookManager;
import task6.business.BookService;
import task6.data.BookRepository;
import task6.data.InMemoryBookRepository;
import task6.domain.Book;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static BookService bookService;

    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepository();
        bookService = new BookManager(bookRepository);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Show all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> removeBook(scanner);
                case 3 -> showAllBooks();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        bookService.addBook(title, author, price);

        System.out.println("Book added successfully");
    }

    private static void removeBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        bookService.removeBook(title, author, price);

        System.out.println("Book removed successfully");
    }

    private static void showAllBooks() {
        List<Book> books = bookService.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice());
                System.out.println("");
            }
        }
    }
}

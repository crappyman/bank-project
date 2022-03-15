package dao;
import java.util.List;

public interface BookDao {

	List<BookPojo> fetchBooks();
	BookPojo addBook(BookPojo bookPojo);
	BookPojo updateBook(int bookId);
	BookPojo deleteBook(int bookId);
}

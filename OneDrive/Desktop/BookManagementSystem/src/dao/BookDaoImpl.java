package dao;
import java.util.ArrayList;

import java.util.List;

import dao.BookDao;
import dao.BookPojo;

public class BookDaoImpl implements BookDao {
	
	

	List<BookPojo> allBooks;

	
	
	public BookDaoImpl() {
		super();
		allBooks = new ArrayList<BookPojo>();
	}

	@Override
	public List<BookPojo> fetchBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.reactiveworks.dao_pattern.dao;


import java.util.List;

import com.reactiveworks.dao_pattern.model.Books;

public interface BookDao {
  
	List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);
	
}

package com.reactiveworks.dao_pattern.mainmethod;

import com.reactiveworks.dao_pattern.dao.BookDao;
import com.reactiveworks.dao_pattern.dao.BookDaoImpl;
import com.reactiveworks.dao_pattern.model.Books;

public class AccessBook {
	public static void main(String[] args) {

		BookDao bookDao = new BookDaoImpl();

		//  ===============================================
		for (Books book : bookDao.getAllBooks()) {
			System.out.println("Book ISBN : " + book.getIsbn() +" - " + book.getBookName());
		}

		//  update student
		Books book = bookDao.getAllBooks().get(1);
		book.setBookName("Algorithms");
		bookDao.saveBook(book);

		//  ===============================================
		for (Books book1 : bookDao.getAllBooks()) {
			System.out.println("Book ISBN : " + book1.getIsbn() +" - " + book1.getBookName());
		}
	}
}

package com.masai;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
	private List<Book> books;
	private List<User> users;
	
	public LibrarySystem() {
		this.books = new ArrayList<>();
		this.users = new ArrayList<>();
	}
	
	// Adding Book to Library
	public void addBook(Book book) {
		books.add(book);
	}
	
	// User Registration
	public void registerUser(User user) {
		users.add(user);
	}
	
	// Borrow a Book
	public boolean borrowBook(int userId, int bookId) {
		User user = findUserById(userId);
		Book book = findBookById(bookId);
		
		if(user != null && book != null && book.isAvailable()) {
			book.setAvailable(false);
			user.getBooksBorrowed().add(book);
			return true;
		}
		return false;
	}
	
	// Return Book
	public boolean returnBook(int userId, int bookId) {
		User user = findUserById(userId);
		Book book = findBookById(bookId);
		
		if(user != null && book != null && book.isAvailable()) {
			book.setAvailable(true);
			user.getBooksBorrowed().remove(book);
			return true;
		}
		return false;
	}
	
	// List All Books
	public List<Book> listAvailableBooks(){
		List<Book> availableBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.isAvailable()) {
				availableBooks.add(book);
			}
		}
		return availableBooks;
	}
	
	//Show books borrowed
	public List<Book> showBorrowedBooks (int userId){
		User user = findUserById(userId);
		if(user != null) {
			return user.getBooksBorrowed();
		}
		return new ArrayList<>();
	}
	
	public User findUserById(int userId) {
		for(User user : users) {
			if(user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}
	
	public Book findBookById(int bookId) {
		for(Book book : books) {
			if(book.getBookId() == bookId) {
				return book;
			}
		}
		return null;
	}
}
























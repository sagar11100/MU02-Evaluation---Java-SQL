package com.masai;

public class Main {
	public static void main (String[]args) {
		LibrarySystem library = new LibrarySystem();
		
		//Add books
		Book book1 = new Book(1,"Core Java","John Dutch", true);
		Book book2 = new Book(2,"Python for Dummies","Han Zimmer", true);
		library.addBook(book1);
		library.addBook(book2);
		
		//register user
		User user1 = new User(1,"Sagar Vishwakarma");
		library.registerUser(user1);
		
		//Borrow a Book
		library.borrowBook(1, 1);
		
		//List available Books
		System.out.println("Available Books : " + library.listAvailableBooks());
		
		//Show Borrowed Books
		System.out.println("Books Borrowed : " + library.showBorrowedBooks(1));
	}
	
}
















package com.masai;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int userId;
	private String name;
	private List<Book> booksBorrowed;
	
	public User(int userId, String name) {
		this.userId = userId;
		this.name = name;
		this.booksBorrowed = new ArrayList<>();
	}
	
	// Getter and Setter
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Book> getBooksBorrowed(){
		return booksBorrowed;
	}
	public void setBooksBorrowed(List<Book> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}
}
































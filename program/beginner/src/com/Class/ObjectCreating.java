package com.Class;

public class ObjectCreating {
public static void main(String[] args) {
	Book b1 = new Book("The Alchemist", "Paulo Coelho", 399.5);
	Book b2 = new Book(b1);
	b1.displayDetails();
	b2.displayDetails();
	
	b1.price = 450.0;
	System.out.println("\nAfter updating b1 price:\n");
	
	b1.displayDetails();  // Should show 450.0
	b2.displayDetails();
}
}

class Book {
String title;
String author;
double price;

Book(String title, String author, double price) {
	this.title = title;
	this.author = author;
	this.price = price;
}

Book(Book s) {
	this.title = s.title;
	this.author = s.author;
	this.price = s.price;
}

void displayDetails() {
	System.out.println("Title:" + title);
	System.out.println("Author:" + author);
	System.out.println("Price:" + price);
}
}


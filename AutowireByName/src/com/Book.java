package com;

public class Book {
private Customer customer;
private Author author;
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
private float prize;
private String isbn;
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public float getPrize() {
	return prize;
}
public void setPrize(float prize) {
	this.prize = prize;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
@Override
public String toString() {
	return "Book [author=" + author + ", prize=" + prize + ", isbn=" + isbn + "]";
}

}

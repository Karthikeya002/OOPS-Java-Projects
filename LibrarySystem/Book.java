// Book.java
public class Book {
    private String title, author;
    private int year;
    private boolean available;
    public Book(String title, String author, int year) { this.title = title; this.author = author; this.year = year; this.available = true; }
    public void borrowBook() { if(available) available = false; }
    public void returnBook() { available = true; }
    public void displayInfo() { System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year + ", Available: " + available); }
}

package org.example.Library;

import org.example.Book.Book;

import java.util.Arrays;

public class Library {

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBookToLibrary(Book book) {
        int lengthNewBookArray = this.getBooks().length + 1;
        Book[] oldBookArray = this.getBooks();
        Book[] newBookArray = new Book[lengthNewBookArray];
        System.out.println("Länge" + lengthNewBookArray);
        newBookArray[0] = book;
        for (int i = 1; i < lengthNewBookArray; i++) {
            newBookArray[i] = oldBookArray[i - 1];
        }
        this.setBooks(newBookArray);
    }


    @Override
    public String toString() {
        return "Library{" +
                "Books=" + Arrays.toString(books) +
                '}';
    }
}

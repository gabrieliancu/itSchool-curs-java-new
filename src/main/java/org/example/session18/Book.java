package org.example.session18;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer numPages;
    private String isbn;

    public Book(String author, String title, Integer numPages, String isbn) {
        this.author = author;
        this.title = title;
        this.numPages = numPages;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && numPages.equals(book.numPages) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numPages, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}

class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Pair<K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value=" + value +
                '}';
    }
}

class LibraryDemo {
    public static void main(String[] args) {
        Book b1 =new Book("Clean code","Robert",464, "123456");
        Book b2 =new Book("Clean code","Robert",464, "123456");
        Book b3 =new Book("JJava","osh",422, "987654");
        System.out.println("b1 equal b2? " +b1.equals(b2));
        System.out.println("b1 equal b3? " +b1.equals(b3));

        System.out.println("hascode b1: " +b1.hashCode());
        System.out.println("hascode b2: " +b2.hashCode());
        System.out.println("hascode b3: " +b3.hashCode());

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        Box<Book> bookBox = new Box<>();
        bookBox.setItem(b1);
    }






}


package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 0);
        Book book2 = new Book("Путешествия Гулливера", 208);
        Book book3 = new Book("Алиса в Стране чудес и в Зазеркалье", 384);
        Book book4 = new Book("Улисс", 896);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }

        System.out.println("---------------------------");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }

        System.out.println("---------------------------");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getTitle())) {
                System.out.println(book.getTitle() + " index to array: " + i);
            }
        }
    }
}

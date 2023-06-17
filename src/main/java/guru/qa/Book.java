package guru.qa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {

    private String author;
    private String title;
    private int publication_year;
    private String genre;
    private boolean isAdultsOnly;
    private Book[] previousBooks;

    public Book (String author, String title, int publication_year,
                 String genre, boolean isAdultsOnly) {
        this.author = author;
        this.title = title;
        this.publication_year = publication_year;
        this.genre = genre;
        this.isAdultsOnly = isAdultsOnly;

    }

    public void addBook(Book[] previousBooks) {
        this.previousBooks = previousBooks;
    }

    public void printPreviousBooks() {
        for (int i = 0; i > previousBooks.length; i++) {
            System.out.println(previousBooks[i]);
        }
    }


    @Override
    public String toString() {
        return author + " " + "-" + " " + title + "," + " " + "publication year:"
                + " " + publication_year + "," + " " + "genre:" + " " + genre + ","
                + " " + isAdultsOnly + ".";
    }


}

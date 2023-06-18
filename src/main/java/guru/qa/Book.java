package guru.qa;

import java.util.ArrayList;

public class Book {

    private String author;
    private String title;
    private int publication_year;
    private String genre;
    private boolean isAdultsOnly;
    private Book[] previousBooks;
    private ArrayList<Book> bookList;

    public Book(String author, String title, int publication_year,
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
        for (int i = 0; i < previousBooks.length; i++) {
            System.out.println(previousBooks[i]);
        }
    }

    public void printBookByTitleIfPresent(String title) {
        for (int i = 0; i < previousBooks.length; i++) {
            Book previousBook = previousBooks[i];
            if (previousBook.title.equals(title)) {
                System.out.println(previousBook);
                return;
            }
        }
        System.out.println("Not found");
    }

    public Book() {
        this.bookList = new ArrayList<Book>();
    }

    public void addBookToList(Book value) {
        this.bookList.add(value);
    }

    public void removeBook(Book value) {
        this.bookList.remove(value);
    }

    public boolean findBook(Book value) {
        for (Book i : this.bookList) {
            if (i.equals(value))
                return true;
        }
        return false;
    }

    public void printBooks() {
        for (Book i : this.bookList) {
            System.out.println(i);
        }
    }


    @Override
    public String toString() {
        return author + " " + "-" + " " + title + "," + " " + "publication year:"
                + " " + publication_year + "," + " " + "genre:" + " " + genre + ","
                + " " + isAdultsOnly + ".";
    }

}




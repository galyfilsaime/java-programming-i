/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author galyfilsaime
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String bookTitle, int numberOfPages, int publicationYear) {
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.year = publicationYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPublicationYear() {
        return this.year;
    }
    
    public int getNumberOfPages() {
        return this.pages;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}

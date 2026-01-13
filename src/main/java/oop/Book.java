package oop;

public class Book {

    String author;
    String title;
    int yearOfPublication;
    int page;

    public Book(String author, String title, int yearOfPublication, int page){
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.page = page;
    }

    public void setYearOfPublication (int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthorAndTitle(){
        String authorAndTitle = author + " " + title;
        return authorAndTitle;

    }




}

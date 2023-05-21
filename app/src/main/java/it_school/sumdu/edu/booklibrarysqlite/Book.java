package it_school.sumdu.edu.booklibrarysqlite;

public class Book {
    private int id;
    private String title;
    private String author;
    private int page;

    public Book(int id,String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }
}

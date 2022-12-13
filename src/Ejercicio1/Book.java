package Ejercicio1;

public class Book {
    private String title;
    private String author;
    private String pages;

    public Book() {

    }

    public Book(String title, String author, String pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void ShowBook() {
        System.out.println("Book title is: " + title);
        System.out.println("Author is: " + author);
        System.out.println("Number of pages is " + pages);
    }

}

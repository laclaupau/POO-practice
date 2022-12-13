import java.util.Scanner;

public class Song {
    private String title;
    private String author;

    public Song() {

    }

    public Song(String title, String author) {
        this.author = author;
        this.title = title;
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

    public void CreateSong() {
        Scanner input = new Scanner(System.in).useDelimiter("/n");
        System.out.println("Type in song's title");
        title = input.nextLine();
        System.out.println("Type in song's author");
        author = input.nextLine();
    }

    public void ShowSong() {
        System.out.println("Song's title is " + title);
        System.out.println("Song's author is " + author);
    }
}

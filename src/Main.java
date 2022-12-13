import Ejercicio1.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Type in book's title");
        String title = input.nextLine();
        System.out.println("Type in author's name");
        String author = input.nextLine();
        System.out.println("Type in number of pages");
        String pages = input.nextLine();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(pages);

        book.ShowBook();
    }
}
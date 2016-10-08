package krokpokroku;

/**
 * Created by Moniałkę on 2016-09-27.
 */
public class Library {
    public static void main( String[]args) {
        final String appName = "Biblioteka v 0.1";

        Book book1= new Book();
        book1.author="Henryk Sienkiewicz";
        book1.title="W pustyni i w puszczy";
        book1.publisher="Grzmot";
        book1.pages=123;
        book1.releaseDate=1960;
        book1.isbn="737747434343434";

        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.author);
        System.out.println(book1.title);
        System.out.println(book1.publisher);
        System.out.println(book1.pages);
        System.out.println(book1.releaseDate);
        System.out.println(book1.isbn);


    }

}

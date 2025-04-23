import java.util.ArrayList;
import java.util.HashSet;

public class Book {
    private static final HashSet<String> GLOBAL_ISBNS = new HashSet<>();
    private final String title;
    private final String author;
    private final Integer publicationYear;
    private final String ISBN;

    public Book(String title, String author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = getUniqueISBN();
        GLOBAL_ISBNS.add(ISBN);
    }

    private String getUniqueISBN() {
        String ISBN;

        do {
           ISBN = IsbnGenerator.run();
        } while (GLOBAL_ISBNS.contains(ISBN));

        return ISBN;
    }

    @Override
    public String toString() {
        return "==========BOOK==========\n"
                + "title: " + title
                + "\nauthor: " + author
                + "\npublicationYear: " + publicationYear
                + "\nISBN: " + ISBN
                + "\n========================" ;
    }
}

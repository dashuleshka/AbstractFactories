import java.util.Comparator;
public class Book implements Comparable<Book> {
    public String Name;
    public String Author;

    public Book(String name, String author) {
        Name = name;
        Author = author;
    }
    @Override
    public int compareTo(Book book) {
        return Name.compareTo(book.Name);
    }
    @Override
    public String toString() {
        return Name;
    }
    static class BookByAuthorComporator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.Author.compareTo(book2.Author);
        }
    }
    static class BookByAuthorComporatorBack implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            return book2.Author.compareTo(book1.Author);
        }
    }

    public  String getName() {
        return Name;
    }
}

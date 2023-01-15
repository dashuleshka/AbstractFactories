import javax.lang.model.element.Name;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<Book>();
        library.add(new Book("Капитанская дочка", "Пушкин"));
        library.add(new Book("Мёртвые души", "Гоголь"));
        library.add(new Book("Разочарованный цветок", "Bob Mirskiy"));
        library.add(new Book("Азбука", "Лев Толстой"));

        Collections.sort(library);
        System.out.println(library);

        Comparator AuthCompor = new Book.BookByAuthorComporator();
        Collections.sort(library, AuthCompor);
        System.out.println(library);

        Comparator AuthComporBack = new Book.BookByAuthorComporatorBack();
        Collections.sort(library, AuthComporBack);
        System.out.println(library);

        // backsort by name:
        Collections.sort(library, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(library);

        //()->System.out.println("Hello world!");
    }
}
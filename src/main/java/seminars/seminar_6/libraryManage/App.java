package seminars.seminar_6.libraryManage;

import java.util.ArrayList;

public class App    {
    public static void main(String[] args) {
        BookGenre bookGenre1 = new BookGenre("Ужасы");
        Book book = new Book("Книга 1", "Автор", bookGenre1);
        Book book2 = new Book("Книга 2", "Автор", bookGenre1);
        Book book3 = new Book("Книга 3", "Автор 2", bookGenre1);
        Library library = new Library(new ArrayList<>());
        library.add(book);
        library.add(book2);
        library.add(book3);
        System.out.println(library.findByAuthor("Автор"));
    }
}

package seminars.seminar_6.libraryManage;

import java.util.List;

public class Library implements Searchable {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book findByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) return books.get(i);
        }
        return null;
    }
    public void add(Book book) {
        books.add(book);
    }
}

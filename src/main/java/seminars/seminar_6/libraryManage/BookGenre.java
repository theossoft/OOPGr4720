package seminars.seminar_6.libraryManage;

public class BookGenre implements Genre{
    private String bookGenre;
    @Override
    public String takeGenre() {
        return bookGenre;
    }

    public BookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "bookGenre='" + bookGenre + '\'' +
                '}';
    }
}

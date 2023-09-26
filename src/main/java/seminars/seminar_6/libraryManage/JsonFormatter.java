package seminars.seminar_6.libraryManage;

public class JsonFormatter implements Formatter{
    @Override
    public void formatTo(Book book) {
        System.out.println("Книга преобразована в Json");
    }
}

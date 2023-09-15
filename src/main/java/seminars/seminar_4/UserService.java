package seminars.seminar_4;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String name,int score,int age);
}

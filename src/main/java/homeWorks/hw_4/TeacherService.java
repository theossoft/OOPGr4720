package homeWorks.hw_4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int rating, int age) {
        Teacher teacher = new Teacher(name, rating, age);
        teachers.add(teacher);
    }


}

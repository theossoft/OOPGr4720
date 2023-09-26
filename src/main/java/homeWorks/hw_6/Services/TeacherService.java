package homeWorks.hw_6.Services;


import homeWorks.hw_6.Domen.PersonComparator;
import homeWorks.hw_6.Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {

    private String acadDegree;
    private List<Teacher> teachers; // Список учетилей

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName,age, this.acadDegree);
        teachers.add(per);
    }

    // Сортировка списка преподавателей по ФИО
    public void sortByFIO()
    {
        teachers.sort( new PersonComparator<Teacher>());
    }
}

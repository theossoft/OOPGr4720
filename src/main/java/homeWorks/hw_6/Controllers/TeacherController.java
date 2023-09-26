package homeWorks.hw_6.Controllers;


import homeWorks.hw_6.Domen.Teacher;
import homeWorks.hw_6.Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService dataService = new TeacherService();

    //Метод регистрации преподавателя в базе данных
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIO();
    }
}

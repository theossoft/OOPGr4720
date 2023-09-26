package homeWorks.hw_6.Controllers;


import homeWorks.hw_6.Domen.Student;
import homeWorks.hw_6.Services.StudentService;

public class StudentController implements iPersonController<Student> {
    private final StudentService dataService = new StudentService();

    //Метод регистрации студената в базе данных
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIOStdLst();
    }

}
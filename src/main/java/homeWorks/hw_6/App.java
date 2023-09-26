package homeWorks.hw_6;


import homeWorks.hw_6.Controllers.EmploeeController;
import homeWorks.hw_6.Domen.*;
import homeWorks.hw_6.Services.AverageAge;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
// Создание студентов
         Student s1 = new Student("Иван", 25, 121);
         Student s2 = new Student("Игорь", 23, 301);
         Student s3 = new Student("Иван", 19, 121);
         Student s4 = new Student("Игорь",  23, 444);
         Student s5 = new Student("Даша",  18, 171);
         Student s6 = new Student("Лена",  20, 106);
         Student s7 = new Student("Петр", 25, 127);
         Student s8 = new Student("Григорий", 24, 701);
         Student s9 = new Student("Анатолий", 22, 181);
         Student s10 = new Student("Жерар",  23, 445);
         Student s11 = new Student("Игнат", 18, 125);
         Student s12 = new Student("Жерар",  27, 789);

// Добавление студентов в список
         List<Student> listStud = new ArrayList<Student>();
         listStud.add(s1);
         listStud.add(s2);
         listStud.add(s3);
         listStud.add(s4);
         listStud.add(s5);
         listStud.add(s6);
         List<Student> listStud1 = new ArrayList<Student>();
         listStud1.add(s7);
         listStud1.add(s8);
         listStud1.add(s9);
         listStud1.add(s10);
         List<Student> listStud2 = new ArrayList<Student>();
         listStud2.add(s11);
         listStud2.add(s12);
// Создание студенческой группы из списка студентов
         StudentGroup group4580 = new StudentGroup(listStud, 4580);
//         System.out.println(group4580);
         StudentGroup group4056 = new StudentGroup(listStud1, 4056);
         StudentGroup group2028 = new StudentGroup(listStud2, 2028);
//
////         for(Student std : group4580)
////         {
////             System.out.println(std);
////         }
//// Создание потока студентов из студенческих групп
//         List<StudentGroup> studentGroupList = new ArrayList<>();
//         studentGroupList.add(group4580);
//         studentGroupList.add(group4056);
//         studentGroupList.add(group2028);
//         StudentSteam studentSteam = new StudentSteam(1, studentGroupList);
//
//// Вывод студенческих потоков на экран
//         for(StudentGroup studentGroup : studentSteam) {
//              System.out.println(studentGroup.getIdGroup() + " " + studentGroup);
//         }
//         System.out.println(studentSteam);
//         Collections.sort(studentGroupList);
//         for(StudentGroup studentGroup : studentSteam) {
//              System.out.println(studentGroup.getIdGroup() + " " + studentGroup);
//         }
//
//
////         System.out.println("=========================================================");
////// Сортировка студенческой группы по заданным параметрам
////         Collections.sort(group4580.getGroup());
////
////         for(Student std: group4580.getGroup())
////         {
////             System.out.println(std);
////         }
////// Конец сортировки студентов

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        //comS.compare(s1, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);

        // Средний возраст студенктов в группе
        AverageAge age = new AverageAge();
        System.out.println(age.getAverageAge(listStud));

    }
}

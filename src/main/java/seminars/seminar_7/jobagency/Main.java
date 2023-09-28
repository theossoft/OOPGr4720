package seminars.seminar_7.jobagency;

public class Main {

    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");
        Povar peshkov = new Povar("Peshkov");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(peshkov);
        for (int i = 0; i < 2; i++) {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}

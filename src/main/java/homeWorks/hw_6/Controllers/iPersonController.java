package homeWorks.hw_6.Controllers;


import homeWorks.hw_6.Domen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, int age);    
}

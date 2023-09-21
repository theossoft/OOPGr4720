package homeWorks.hw_5.format;


import homeWorks.hw_5.PhoneBook;

public interface Saveable {
    void saveAs(PhoneBook phonebook, String path);
}

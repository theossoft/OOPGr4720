package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Csv extends Format {
    @Override
    public void saveAs(PhoneBook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write("<?CSV Format>\n");
            for (Contact contact : phonebook.getContacts()) {
                writer.write(contact.getLastName() + contact.getFirstName() + "," + contact.getPhone() + "," + contact.getEmail() + "\n");
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    @Override
    public PhoneBook load(Format format, String path) throws IOException {
        PhoneBook phonebook = new PhoneBook();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            Contact newContact = new Contact(values[0], values[1], values[2]);
            phonebook.add(newContact);
        }
        return phonebook;
    }
}

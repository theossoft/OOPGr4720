package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.Phonebook;
import homeWorks.hw_5.Format;

import java.io.FileWriter;
import java.io.IOException;

public class Json extends Format {
    @Override
    public void saveAs(Phonebook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write("[");
            for (int i = 0; i < phonebook.getContacts().size(); i++) {
                Contact contact = phonebook.getContact(i);
                writer.write("{\"name\":\"" + contact.getLastName() + "\",");
                writer.write("\"phone\":\"" + contact.getPhone() + "\",");
                writer.write("\"email\":\"" + contact.getEmail() + "\"}");
                if (i < phonebook.getContacts().size() - 1) {
                    writer.write(",");
                }
            }
            writer.write("]");
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.Phonebook;
import homeWorks.hw_5.Format;

import java.io.FileWriter;
import java.io.IOException;

public class Csv extends Format {
    @Override
    public void saveAs(Phonebook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write("<?CSV Format>\n");
            for(Contact contact : phonebook.getContacts()) {
                writer.write(contact.getLastName() + contact.getFirstName() + "," + contact.getPhone() + "," + contact.getEmail() + "\n");
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

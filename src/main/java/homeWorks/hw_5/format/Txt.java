package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Txt extends Format {
    @Override
    public void saveAs(PhoneBook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            writer.write("<?TXT Format>\n");
            for (Contact contact : phonebook.getContacts()) {
                writer.write("* " + contact.getLastName() + "\n");
                writer.write("  Телефон: " + contact.getPhone() + "\n");
                writer.write("  E-mail: " + contact.getEmail() + "\n");
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
        Contact contact = null;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("* ")) {
                contact = new Contact();
                contact.setLastName(line.substring(2));
            } else if (line.startsWith("  Телефон: ")) {
                contact.setPhone(line.substring(12));
            } else if (line.startsWith("  E-mail: ")) {
                contact.setEmail(line.substring(10));
                phonebook.add(contact);
            }
        }
        return phonebook;
    }
}

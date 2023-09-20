package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.Phonebook;
import homeWorks.hw_5.Format;

import java.io.FileWriter;
import java.io.IOException;

public class Ldif extends Format {
    @Override
    public void saveAs(Phonebook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            for(Contact contact : phonebook.getContacts()) {
                writer.write("dn: cn=" + contact.getLastName() + "\n");
                writer.write("cn: " + contact.getLastName() + "\n");
                writer.write("telephoneNumber: " + contact.getPhone() + "\n");
                writer.write("mail: " + contact.getEmail() + "\n");
                writer.write("objectClass: top\n");
                writer.write("objectClass: person\n");
                writer.write("objectClass: organizationalPerson\n");
                writer.write("objectClass: inetOrgPerson\n\n");
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

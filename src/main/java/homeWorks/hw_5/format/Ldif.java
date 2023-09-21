package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ldif extends Format {
    @Override
    public void saveAs(PhoneBook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            for (Contact contact : phonebook.getContacts()) {
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

    @Override
    public PhoneBook load(Format format, String path) throws IOException {
        PhoneBook phonebook = new PhoneBook();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        Contact contact = null;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("dn:")) {
                contact = new Contact();
            } else if (line.startsWith("cn:")) {
                contact.setLastName(line.substring(4));
            } else if (line.startsWith("telephoneNumber:")) {
                contact.setPhone(line.substring(17));
            } else if (line.startsWith("mail:")) {
                contact.setEmail(line.substring(6));
            } else if (line.trim().length() == 0 && contact != null) {
                phonebook.add(contact);
                contact = null;
            }
        }
        if (contact != null) {
            phonebook.add(contact);
        }

        return phonebook;
    }
}

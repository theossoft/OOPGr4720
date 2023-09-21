package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.PhoneBook;

import java.io.*;

public class Vcf extends Format {
    @Override
    public void saveAs(PhoneBook phonebook, String path) {
        try (FileWriter writer = new FileWriter(path + ".csv", false)) {
            for (Contact contact : phonebook.getContacts()) {
                writer.write("BEGIN:VCARD\n");
                writer.write("VERSION:2.1\n");
                writer.write("N:" + contact.getLastName() + "\n");
                writer.write("TEL:" + contact.getPhone() + "\n");
                writer.write("EMAIL:" + contact.getEmail() + "\n");
                writer.write("END:VCARD\n");
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
            if (line.startsWith("BEGIN:VCARD")) {
                contact = new Contact();
            } else if (line.startsWith("N:")) {
                contact.setLastName(line.substring(2));
            } else if (line.startsWith("TEL:")) {
                contact.setPhone(line.substring(4));
            } else if (line.startsWith("EMAIL:")) {
                contact.setEmail(line.substring(6));
            } else if (line.startsWith("END:VCARD")) {
                phonebook.add(contact);
            }
        }

        return phonebook;
    }
}

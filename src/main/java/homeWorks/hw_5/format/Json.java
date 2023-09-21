package homeWorks.hw_5.format;

import homeWorks.hw_5.Contact;
import homeWorks.hw_5.PhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Json extends Format {
    @Override
    public void saveAs(PhoneBook phonebook, String path) {
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

    @Override
    public PhoneBook load(Format format, String path) throws IOException {
        PhoneBook phonebook = new PhoneBook();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        StringBuilder builder = new StringBuilder();
        while((line = reader.readLine()) != null) {
            builder.append(line);
        }

//        String json = builder.toString();
//        JSONArray jsonArray = new JSONArray(json);
//        for(int i = 0; i < jsonArray.length(); i++) {
//            JSONObject obj = jsonArray.getJSONObject(i);
//            Contact importedContact = new Contact(obj.getString("name"), obj.getString("phone"), obj.getString("email"));
//            phonebook.add(importedContact);
//        }

        return phonebook;
    }
}

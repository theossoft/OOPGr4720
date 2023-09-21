package homeWorks.hw_5.format;

import homeWorks.hw_5.PhoneBook;

import java.io.IOException;

public interface Loadable {
    PhoneBook load(Format format, String path) throws IOException;
}

package homeWorks.hw_5.view;

import homeWorks.hw_5.Format;
import homeWorks.hw_5.Phonebook;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Loadable {
    Phonebook load(Format format, String path) throws IOException;
}

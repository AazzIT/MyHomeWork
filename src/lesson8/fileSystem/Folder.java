package lesson8.fileSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class Folder extends File {
    File[] files = {};
    ArrayList<File> filesList;

    public Folder(String name) {
        super.setName(name);
        super.setType("Folder");
        this.filesList = new ArrayList<>(Arrays.asList(files));
    }

    public void addFile(File file) {
        filesList.add(file);
    }

    public void dir() {
        filesList
                .forEach(System.out::println);
    }
}


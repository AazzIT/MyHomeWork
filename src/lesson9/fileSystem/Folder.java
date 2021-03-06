package lesson9.filesystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Folder extends File {
    List<File> filesList;
    Comparator<File> byFileName;

    public Folder(String name) {
        super.setName(name);
        super.setType("Folder");
        this.filesList = new ArrayList<>();
    }

    public void addFile(File file) {
        filesList.add(file);
    }

    public String showListOfFiles() {
        String returnString = super.getName() + " /";
        for (File file : filesList) {
            returnString += "\n" + file.toString();
        }
        return returnString;
    }

    public String showListOfFilesSortedByName() {
        String returnString = super.getName() + " /";
        byFileName = (f1, f2) -> f1
                .getName()
                .compareTo(f2
                        .getName());
        List<File> sortedFilesList = filesList
                .stream()
                .sorted(byFileName)
                .collect(Collectors.toList());
        for (File file : sortedFilesList) {
            returnString += "\n" + file.toString();
        }
        return returnString;
    }

}


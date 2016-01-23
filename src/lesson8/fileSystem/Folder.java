package lesson8.fileSystem;

import java.util.ArrayList;
import java.util.Comparator;

public class Folder extends File {
    ArrayList<File> filesList;// если это возможно - используйте полиморфизм List<File> list = new ArrayList<>;
    Comparator<File> byFileName;

    public Folder(String name) {
        super.setName(name);
        super.setType("Folder");
        this.filesList = new ArrayList<>();
    }

    public void addFile(File file) {
        filesList.add(file);
    }

    public void dir() { //а что это имя метода обозначает? напоминаю, что имя метода должно начинаться с глагола
        System.out.println(super.getName() + " /");
        filesList
                .forEach(System.out::println);
    }

    public void dirSortedByName() { //также имя метода должно начинаться с глагола
        byFileName = (f1, f2) -> f1
                .getName()
                .compareTo(f2
                        .getName());
        System.out.println(super.getName() + " /");
        filesList
                .stream()
                .sorted(byFileName)
                .forEach(System.out::println);
    }
}


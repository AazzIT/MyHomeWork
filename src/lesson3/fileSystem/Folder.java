package lesson3.fileSystem;

public class Folder extends File {
    public Folder(String name, String parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Folder");
        super.setParentFolder(parentFolder);
    }
}

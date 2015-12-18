package lesson3.fileSystem;

public class Folder extends File {
    public Folder(String nameFolder, String parentFolder) {
        super.setName(nameFolder);
        super.setTypeOfFile("I am Folder");
        super.setParentFolder(parentFolder);
    }
}

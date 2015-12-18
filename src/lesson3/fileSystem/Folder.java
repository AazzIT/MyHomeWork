package lesson3.fileSystem;

public class Folder extends File {

    public Folder() {
        super.setName("Root");
        super.setTypeOfFile("I am Folder");

    }

    public Folder(String name, Folder parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Folder");
        super.setParentFolder(parentFolder);
    }

}

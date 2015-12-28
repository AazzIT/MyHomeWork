package lesson6.fileSystem;

public class Folder extends File {
    public File[] files;

    public Folder() {
        super.setName("Root");
        super.setType("Folder");
        files = new File[10];
    }

    public Folder(String name, File parentFolder) {
        super.setName(name);
        super.setType("Folder");
        super.setParentFolder(parentFolder);
    }
}


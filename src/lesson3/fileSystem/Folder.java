package lesson3.fileSystem;

public class Folder extends File {
    //Rewrite and Overload our constructor with different Signature
    //Without parameters
    public Folder() {
        super.setName("Root");
        super.setType("Folder");
    }

    //With parameters
    public Folder(String name, Folder parentFolder) {
        super.setName(name);
        super.setType("I am Folder");
        super.setParentFolder(parentFolder);
    }
}

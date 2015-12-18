package lesson3.fileSystem;

public class PictureFile extends File {
    public PictureFile(String name, String parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Picture");
        super.setParentFolder(parentFolder);
    }
}

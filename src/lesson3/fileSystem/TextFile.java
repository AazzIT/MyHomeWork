package lesson3.fileSystem;

public class TextFile extends File {
    public TextFile(String name, String parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Text");
        super.setParentFolder(parentFolder);
    }
}

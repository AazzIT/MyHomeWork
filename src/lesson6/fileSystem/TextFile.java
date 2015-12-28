package lesson6.fileSystem;

public class TextFile extends File {
    public TextFile(String name, File parentFolder) {
        super.setName(name);
        super.setType("Text");
        super.setParentFolder(parentFolder);
    }
}

package lesson3.fileSystem;

public class TextFile extends File {
    public TextFile(String name, Folder parentFolder) {
        super.setName(name);
        super.setType("Text");
        super.setParentFolder(parentFolder);
    }
}

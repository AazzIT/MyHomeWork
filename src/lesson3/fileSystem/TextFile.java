package lesson3.fileSystem;
//class Text File
public class TextFile extends File {
    public TextFile(String name, Folder parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Text");
        super.setParentFolder(parentFolder);
    }
}

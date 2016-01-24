package lesson10.fileSystem;

public class TextFile extends File {
    public TextFile(String name) {
        super.setName(name);
        super.setType("Text");
    }
}

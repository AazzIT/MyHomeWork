package lesson9.filesystem;

public class TextFile extends File {
    public TextFile(String name) {
        super.setName(name);
        super.setType("Text");
    }
}

package lesson3.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root","Root");
        rootFolder.getName();
        rootFolder.getParentFolder();
        rootFolder.getTypeOfFile();

        AudioFile file1 = new AudioFile("text","Root");
        file1.getName();
        file1.getParentFolder();
        file1.getTypeOfFile();

    }

}

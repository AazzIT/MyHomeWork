package lesson3.fileSystem;

public class AudioFile extends File {

    public AudioFile(String name, String parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Audio");
        super.setParentFolder(parentFolder);
    }


}

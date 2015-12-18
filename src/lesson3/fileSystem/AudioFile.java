package lesson3.fileSystem;

public class AudioFile extends File {
    public AudioFile(String name, Folder parentFolder) {
        super.setName(name);
        super.setType("Audio");
        super.setParentFolder(parentFolder);
    }
}

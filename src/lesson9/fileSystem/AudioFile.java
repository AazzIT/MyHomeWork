package lesson9.fileSystem;

public class AudioFile extends File {
    public AudioFile(String name) {
        super.setName(name);
        super.setType("Audio");
    }
}

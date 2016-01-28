package lesson9.filesystem;

public class AudioFile extends File {
    public AudioFile(String name) {
        super.setName(name);
        super.setType("Audio");
    }
}

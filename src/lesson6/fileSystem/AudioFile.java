package lesson6.fileSystem;

public class AudioFile extends File {
    public AudioFile(String name, File parentFolder) {
        if (name.substring(name.length() - 4 ,name.length()).equals(".mp3")) {
            super.setName(name);
            super.setType("Audio");
            super.setParentFolder(parentFolder);
        } else
            throw new IllegalStateException("[Error]: Illegal File Extension of Audio File! Must be .mp3");
    }
}

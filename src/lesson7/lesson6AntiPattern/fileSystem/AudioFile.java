package lesson7.lesson6AntiPattern.fileSystem;

public class AudioFile extends File {

    public AudioFile(String name, File parentFolder) {
        if (name.substring(name.length() - 4 ,name.length()).equals(MP3_EXTENSION)) {
            super.setName(name);
            super.setType(AUDIO_FILE_TYPE);
            super.setParentFolder(parentFolder);
        } else
            throw new IllegalStateException("[Error]: Illegal File Extension of Audio File! Must be .mp3");
    }
}

package lesson7.lesson6AntiPattern.fileSystem;

public abstract class File {
    public static final String MP3_EXTENSION = ".mp3";
    public static final String GIF_EXTENSION = ".gif";
    public static final String TXT_EXTENSION = ".txt";
    public static final String AUDIO_FILE_TYPE = "Audio";
    public static final String PICTURE_FILE_TYPE = "Picture";
    public static final String TEXT_FILE_TYPE = "Text";
    public static final String ROOT_FOLDER_TYPE = "Root";
    public static final String FOLDER_TYPE = "Folder";

    private String name;
    private String type;
    private File parentFolder;

    protected File() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentFolder() {
        if (this.name.equals(ROOT_FOLDER_TYPE)){
            return ROOT_FOLDER_TYPE;
        } else {
            return parentFolder.getName();
        }
    }

    public void setParentFolder(File parentFolder) {
        this.parentFolder = parentFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "File {" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", parentFolder=" + parentFolder +
                "}";
    }
}

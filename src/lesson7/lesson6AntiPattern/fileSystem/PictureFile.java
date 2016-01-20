package lesson7.lesson6AntiPattern.fileSystem;

public class PictureFile extends File {


    public PictureFile(String name, File parentFolder) {
        if (name.substring(name.length() - 4 ,name.length()).equals(GIF_EXTENSION)) {
            super.setName(name);
            super.setType(PICTURE_FILE_TYPE);
            super.setParentFolder(parentFolder);
        } else
            throw new IllegalStateException("[Error]: Illegal File Extension of Picture File! Must be \".gif\"");
    }
}

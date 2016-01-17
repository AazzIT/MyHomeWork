package lesson6.fileSystem;

public class PictureFile extends File {


    public PictureFile(String name, File parentFolder) {
        if (name.substring(name.length() - 4 ,name.length()).equals(GIF_EXTENSION)) {//Хардкод
            super.setName(name);
            super.setType(PICTURE_FILE_TYPE);//Хардкод
            super.setParentFolder(parentFolder);
        } else
            throw new IllegalStateException("[Error]: Illegal File Extension of Picture File! Must be \".gif\"");
    }
}

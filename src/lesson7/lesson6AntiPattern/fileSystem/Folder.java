package lesson7.lesson6AntiPattern.fileSystem;

public class Folder extends File {
    public File[] files;

    public Folder() {
        super.setName(ROOT_FOLDER_TYPE);//Хардкод
        super.setType(FOLDER_TYPE);//Хардкод
        files = new File[10];
    }

    public Folder(String name, File parentFolder) {
        super.setName(name);
        super.setType(FOLDER_TYPE);//Хардкод
        super.setParentFolder(parentFolder);
    }
}


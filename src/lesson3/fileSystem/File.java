package lesson3.fileSystem;

public abstract class File {
    private String name;
    private String typeOfFile;
    private String parentFolder;

    protected File() {
        name = "Root";
        typeOfFile = "Folder";
        parentFolder = "Root";
    }


    public void getTypeOfFile() {
        System.out.println(typeOfFile);
    }

    public void setTypeOfFile(String type) {
        this.typeOfFile = type;
    }

    public void getParentFolder() {
        System.out.println(parentFolder);
    }

    public void setParentFolder(String parentFolderName) {
        this.parentFolder = parentFolderName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

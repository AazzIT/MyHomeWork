package lesson3.fileSystem;

public abstract class File {
    private String name;
    private String typeOfFile;
    private Folder parentFolder;


    protected File() {
    }


    public String getTypeOfFile() {
        //System.out.println(typeOfFile);
        return typeOfFile;
    }

    public void setTypeOfFile(String type) {
        this.typeOfFile = type;
    }

    public String getParentFolder() {
        //System.out.println(parentFolder.getName());
        return parentFolder.getName();
    }

    public void setParentFolder(Folder parentFolderName) {
        this.parentFolder = parentFolderName;
    }

    public String getName() {
        //System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

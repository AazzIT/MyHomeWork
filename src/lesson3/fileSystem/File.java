package lesson3.fileSystem;

public abstract class File {
    private String name;
    private String typeOfFile;
    private Folder parentFolder;


    protected File() {
    }


    public String getTypeOfFile() {
        //
        return typeOfFile;
    }

    public void setTypeOfFile(String type) {
        this.typeOfFile = type;
    }

    public String getParentFolder() {
        //
        if (this.getName() == "Root"){
            return "I am root Folder ";
        }else{
            return parentFolder.getName();
        }
    }

    public void setParentFolder(Folder parentFolderName) {
        this.parentFolder = parentFolderName;
    }

    public String getName() {
        //
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void printInfo(){
        System.out.println("My Name is " + this.getName());
        System.out.println("My Folder -  " + this.getParentFolder());
        System.out.println(this.getTypeOfFile());
        System.out.println();
    }
}

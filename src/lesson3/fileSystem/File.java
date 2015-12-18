package lesson3.fileSystem;
//Делаем пробел между строкой package и объявлением класса (либо импортов)

//Abstract SuperClass File
public abstract class File {
    private String name;
    private String typeOfFile;
    private Folder parentFolder;

    protected File() {
    }

    public String getTypeOfFile() {
        return typeOfFile;
    }

    public void setTypeOfFile(String type) {
        this.typeOfFile = type;
    }

    public String getParentFolder() {
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // View Information about our File(or Folder))
    protected void printInfo(){
        System.out.println("My Name is " + this.getName());
        System.out.println("My Folder -  " + this.getParentFolder());
        System.out.println(this.getTypeOfFile());
        System.out.println();
    }
}

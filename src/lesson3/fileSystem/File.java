package lesson3.fileSystem;
//Делаем пробел между строкой package и объявлением класса (либо импортов), поправить везде

//Abstract SuperClass File      Излишний коммент
public abstract class File {
    private String name;
    private String typeOfFile;  //Можно просто type, так как будет видно, что это относится к классу File
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
        if (this.getName() == "Root"){  // строки мы сравниваем через метод equals, но не через ==, гуглим
            return "I am root Folder ";
        }else{
            return parentFolder.getName();
        }
    }

    public void setParentFolder(Folder parentFolderName) { //У тебя в классе Folder есть метод getName, не надо путать сущность Folder
        this.parentFolder = parentFolderName;              // и стринговый name. Прими параметром folder, затем возьми у него имя.
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

    // В общем можно представить себе, что есть класс Folder, но в Java реализован класс File, который может быть файлом,
    // может быть папкой. Но это на будущее, может еще рано.

    //Абстрактный класс предполагает, что может содержать в себе не реализованные методы (абстрактные), а уже наследники
    //реализуют их конкретно. Можно это тоже использовать.
}

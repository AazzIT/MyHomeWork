package lesson3.fileSystem;

public abstract class File {
    private String name;
    private String type;
    private File parentFolder;

    protected File() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentFolder() {
        if (this.name.equals("Root")){
            return "root Folder ";
        }else{
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

    // View Information about our File(or Folder))
    protected void printInfo(){
        System.out.println("My Name is " + this.getName());
        System.out.println("My Folder -  " + this.getParentFolder());
        System.out.println(this.getType());
        System.out.println();
    }

    // В общем можно представить себе, что есть класс Folder, но в Java реализован класс File, который может быть файлом,
    // может быть папкой. Но это на будущее, может еще рано.

    //Абстрактный класс предполагает, что может содержать в себе не реализованные методы (абстрактные), а уже наследники
    //реализуют их конкретно. Можно это тоже использовать.
    //Анатолий: Я реализовывал абстрактный класс чтобы инкапсулировать, то есть запретить инциализацию его екземпляров
}

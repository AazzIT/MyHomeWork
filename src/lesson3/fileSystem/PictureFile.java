package lesson3.fileSystem;
//Class Picture File
public class PictureFile extends File {
    public PictureFile(String name, Folder parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Picture");
        super.setParentFolder(parentFolder);
    }
}

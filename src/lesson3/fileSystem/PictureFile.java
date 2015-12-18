package lesson3.fileSystem;

public class PictureFile extends File {
        public PictureFile(String name, Folder parentFolder) {
        super.setName(name);
        super.setType("I am Picture");
        super.setParentFolder(parentFolder);
    }
}

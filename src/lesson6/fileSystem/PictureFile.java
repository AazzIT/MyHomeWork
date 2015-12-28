package lesson6.fileSystem;

public class PictureFile extends File {
        public PictureFile(String name, File parentFolder) {
        super.setName(name);
        super.setType("Picture");
        super.setParentFolder(parentFolder);
    }
}

package lesson10.fileSystem;

public class PictureFile extends File {
        public PictureFile(String name) {
        super.setName(name);
        super.setType("Picture");
    }
}

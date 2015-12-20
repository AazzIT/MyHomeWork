package lesson3.fileSystem;

public class Folder extends File {
    public File[] files;
    private int count;

    public Folder() {
        super.setName("Root");
        super.setType("Folder");
        files = new File[10];
    }

    public Folder(String name, Folder parentFolder) {
        super.setName(name);
        super.setType("Folder");
        super.setParentFolder(parentFolder);
    }

    public void add(File file) {
        this.files[count] = file;
    }
}


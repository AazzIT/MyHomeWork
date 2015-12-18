package lesson3.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        Folder rootFolder = new Folder();
        System.out.println("My Name is " + rootFolder.getName());
        System.out.println("My Folder -  " + rootFolder.getParentFolder());
        System.out.println(rootFolder.getTypeOfFile());
        System.out.println();

        Folder folder1 = new Folder("AudioFolder", rootFolder);
        System.out.println("My Name is " + folder1.getName());
        System.out.println("My Folder -  " + folder1.getParentFolder());
        System.out.println(folder1.getTypeOfFile());
        System.out.println();

        AudioFile file1 = new AudioFile("Rock.mp3", folder1);
        System.out.println("My Name is " + file1.getName());
        System.out.println("My Folder -  " + file1.getParentFolder());
        System.out.println(file1.getTypeOfFile());
        System.out.println();

        AudioFile file2 = new AudioFile("Blues.mp3", rootFolder);
        System.out.println("My Name is " + file2.getName());
        System.out.println("My Folder -  " + file2.getParentFolder());
        System.out.println(file2.getTypeOfFile());
        System.out.println();




    }

}

package lesson8.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root");

        rootFolder.addFile(new TextFile("TextOfSong.txt"));

        Folder pictureFolder = new Folder("PictureFiles");
        rootFolder.addFile(pictureFolder);

        Folder audioFolder = new Folder("AudioFiles");
        rootFolder.addFile(audioFolder);

        audioFolder.addFile(new AudioFile("Rock.mp3"));
        audioFolder.addFile(new AudioFile("Blues.mp3"));
        audioFolder.addFile(new AudioFile("Jazz.mp3"));
        audioFolder.addFile(new AudioFile("Classic.mp3"));

        pictureFolder.addFile(new PictureFile("LogoCD.gif"));

        System.out.println(rootFolder.listOfFiles());
        System.out.println();

        System.out.println(rootFolder.listOfFilesSortedByName());
        System.out.println();

        System.out.println(audioFolder.listOfFiles());
        System.out.println();

        System.out.println(audioFolder.listOfFilesSortedByName());
        System.out.println();

        System.out.println(pictureFolder.listOfFiles());
        System.out.println();
    }
}

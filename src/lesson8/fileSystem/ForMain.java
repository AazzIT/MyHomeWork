package lesson8.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root");

        Folder audioFolder = new Folder("AudioFiles");
        rootFolder.addFile(audioFolder);

        Folder pictureFolder = new Folder("PictureFiles");
        rootFolder.addFile(audioFolder);

        rootFolder.addFile(new TextFile("TextOfSong.txt"));

        audioFolder.addFile(new AudioFile("Blues.mp3"));
        audioFolder.addFile(new AudioFile("Rock.mp3"));

        pictureFolder.addFile(new PictureFile("LogoCD.gif"));

        rootFolder.dir();
        System.out.println();

        audioFolder.dir();
        System.out.println();

        pictureFolder.dir();
        System.out.println();
    }
}

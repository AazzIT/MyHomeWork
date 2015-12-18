package lesson3.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        //Create Root Folder
        Folder rootFolder = new Folder();
        rootFolder.printInfo();
        //Create Other Folder in Root
        Folder audioFolder = new Folder("AudioFolder", rootFolder);
        audioFolder.printInfo();
        //Create Audio File in AudioFolder
        AudioFile rock = new AudioFile("Rock.mp3", audioFolder);
        rock.printInfo();
        //Create Picture File in AudioFolder
        PictureFile logoCD = new PictureFile("LogoCD.gif", audioFolder);
        logoCD.printInfo();
        //Create Audio File in Root Folder
        AudioFile blues = new AudioFile("Blues.mp3", rootFolder);
        blues.printInfo();
        //Create Text File in AudioFolder
        TextFile textOfSong = new TextFile("TextOfSong.gif", audioFolder);
        textOfSong.printInfo();
    }
}

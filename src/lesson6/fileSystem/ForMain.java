package lesson6.fileSystem;

public class ForMain {
    public static void main(String[] args)  {
        //Create Root Folder.
        File rootFolder = new Folder();
        rootFolder.info();
        //Create Other Folder in Root
        File audioFolder = new Folder("AudioFolder", rootFolder);
        audioFolder.info();
        //Create Audio File in AudioFolder
        try {
            File rock = new AudioFile("Rock.mp3", audioFolder);
            rock.info();
        } catch (IllegalStateException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Create Picture File in AudioFolder
        try {
            File logoCD = new PictureFile("LogoCD.gif", audioFolder);
            logoCD.info();
        } catch (IllegalStateException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Create Audio File in Root Folder
        try {
            File blues = new AudioFile("Blues.mp3", rootFolder);
            blues.info();
        } catch (IllegalStateException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Create Text File in AudioFolder
        try {
            File textOfSong = new TextFile("TextOfSong.txt", audioFolder);
            textOfSong.info();
        } catch (IllegalStateException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Try Call IllegalFileExtensionException
        try {
            File notAudio = new AudioFile("Rock.txt", rootFolder);
        } catch (IllegalStateException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        try {
            File notPicture = new PictureFile("Logo.txt", rootFolder);
        } catch (IllegalStateException e2) {
            System.out.println("\n" + e2.getMessage());
        }
        try {
            File notTxt = new TextFile("Song.gif", rootFolder);
        } catch (IllegalStateException e3) {
            System.out.println("\n" + e3.getMessage());
        }
    }
}

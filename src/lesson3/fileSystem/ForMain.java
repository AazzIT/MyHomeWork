package lesson3.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        //Create Root Folder
        File rootFolder = new Folder(); // Folder тоже наследуется от File и использует его методы, можно также использовать полиморфизм
        rootFolder.printInfo();
        //Create Other Folder in Root
        File audioFolder = new Folder("AudioFolder", rootFolder);
        audioFolder.printInfo();
        //Create Audio File in AudioFolder
        File rock = new AudioFile("Rock.mp3", audioFolder);
        rock.printInfo();
        //Create Picture File in AudioFolder
        File logoCD = new PictureFile("LogoCD.gif", audioFolder);
        logoCD.printInfo();
        //Create Audio File in Root Folder
        File blues = new AudioFile("Blues.mp3", rootFolder);
        blues.printInfo();
        //Create Text File in AudioFolder
        File textOfSong = new TextFile("TextOfSong.gif", audioFolder);
        textOfSong.printInfo();
    }
}

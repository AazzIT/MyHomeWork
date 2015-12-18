package lesson3.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        //Create Root Folder
        Folder rootFolder = new Folder();
        rootFolder.printInfo();
        //Create Other Folder in Root
        Folder AudioFolder = new Folder("AudioFolder", rootFolder);//наименование переменных с маленькой буквы
        AudioFolder.printInfo();
        //Create Audio File in AudioFolder
        AudioFile Rock = new AudioFile("Rock.mp3", AudioFolder);
        Rock.printInfo();
        //Create Picture File in AudioFolder
        PictureFile LogoCD = new PictureFile("LogoCD.gif", AudioFolder);
        LogoCD.printInfo();
        //Create Audio File in Root Folder
        AudioFile Blues = new AudioFile("Blues.mp3", rootFolder);
        Blues.printInfo();
        //Create Text File in AudioFolder
        TextFile TextOfSong = new TextFile("TextOfSong.gif", AudioFolder);
        TextOfSong.printInfo();
    }
}

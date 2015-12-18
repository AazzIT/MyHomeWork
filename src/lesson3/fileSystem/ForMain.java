package lesson3.fileSystem;

public class ForMain {
    public static void main(String[] args) {
        //Create Root Folder
        Folder rootFolder = new Folder();
        rootFolder.printInfo();

        //Create Other Folder in Root
        Folder folder1 = new Folder("AudioFolder", rootFolder);
        folder1.printInfo();

        //Create Audio File in AudioFolder
        AudioFile file1 = new AudioFile("Rock.mp3", folder1);
        file1.printInfo();

        //Create Picture File in AudioFolder
        PictureFile file3 = new PictureFile("LogoCD.gif", folder1);
        file3.printInfo();

        //Create Audio File in Root Folder
        AudioFile file2 = new AudioFile("Blues.mp3", rootFolder);
        file2.printInfo();

        //Create Text File in AudioFolder
        TextFile file4 = new TextFile("TextOfSong.gif", folder1);
        file4.printInfo();
    }



}

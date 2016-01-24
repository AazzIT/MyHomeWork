package lesson9.fileSystem;

public class ForMain {
    public static final int CRYPT_POWER = 114;

    public static void main(String[] args) {
        String encryptString;
        String decryptString;
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
        //Encrypt list of Files
        //вынеси в консоль объяснение, что сделано для каждого блока - шифр, дешифр, сорт...
        encryptString = Cryptographer.encrypt(audioFolder.listOfFiles(), CRYPT_POWER);
        System.out.println(encryptString);
        System.out.println();
        //Decrypt list of Files
        decryptString = Cryptographer.decrypt(encryptString, CRYPT_POWER);
        System.out.println(decryptString);
        System.out.println();
        //Sort and list by Filename
        System.out.println(audioFolder.listOfFilesSortedByName());
        System.out.println();

        System.out.println(pictureFolder.listOfFiles());
        System.out.println();
    }
}

package lesson10.fileSystem;

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
        System.out.println("Вывод информации о содержимом папки Root");
        System.out.println(rootFolder.showListOfFiles());
        System.out.println();
        System.out.println("Сортировка и вывод информации о содержимом папки Root");
        System.out.println(rootFolder.showListOfFilesSortedByName());
        System.out.println();
        System.out.println("Вывод информации о содержимом папки с аудиофайлами");
        System.out.println(audioFolder.showListOfFiles());
        System.out.println();
        System.out.println("Шифрование вывода информации о содержании папки с аудиофайлами");
        encryptString = Cryptographer.encrypt(audioFolder.showListOfFiles(), CRYPT_POWER);
        System.out.println(encryptString);
        System.out.println();
        System.out.println("Дешифрование вывода информации о содержании папки с аудиофайлами");
        decryptString = Cryptographer.decrypt(encryptString, CRYPT_POWER);
        System.out.println(decryptString);
        System.out.println();
        System.out.println("Сортировка и вывод информации о содержимом папки с аудиофайлами");
        System.out.println(audioFolder.showListOfFilesSortedByName());
        System.out.println();
        System.out.println("Вывод информации о содержимом папки с рисунками");
        System.out.println(pictureFolder.showListOfFiles());
        System.out.println();
    }
}

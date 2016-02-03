package lesson9.filesystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CryptographerTest {
    public static final int CRYPT_POWER = 114;

    private String encryptString;
    private String decryptString;
    private Folder rootFolder;
    private Folder pictureFolder;
    private Folder audioFolder;
    private String text;

    @Before
    public void setUp() throws Exception {
        rootFolder = new Folder("Root");

        rootFolder.addFile(new TextFile("TextOfSong.txt"));

        pictureFolder = new Folder("PictureFiles");
        rootFolder.addFile(pictureFolder);

        audioFolder = new Folder("AudioFiles");
        rootFolder.addFile(audioFolder);

        audioFolder.addFile(new AudioFile("Rock.mp3"));
        audioFolder.addFile(new AudioFile("Blues.mp3"));
        audioFolder.addFile(new AudioFile("Jazz.mp3"));
        audioFolder.addFile(new AudioFile("Classic.mp3"));

        pictureFolder.addFile(new PictureFile("LogoCD.gif"));
    }

    @Test
    public void testEncryptDecrypt() throws Exception {
        this.text = audioFolder.showListOfFiles();
        this.encryptString=Cryptographer.encrypt(text,CRYPT_POWER);
        this.decryptString=Cryptographer.decrypt(encryptString,CRYPT_POWER);
        Assert.assertEquals("OK:", text, decryptString);
    }
}
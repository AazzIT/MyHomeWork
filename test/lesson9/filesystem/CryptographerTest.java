package lesson9.filesystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CryptographerTest {
    public static final int CRYPT_POWER = 114;

    Folder audioFolder;

    @Before
    public void setUp() throws Exception {
        audioFolder = new Folder("AudioFiles");
        audioFolder.addFile(new AudioFile("Rock.mp3"));
        audioFolder.addFile(new AudioFile("Blues.mp3"));
        audioFolder.addFile(new AudioFile("Jazz.mp3"));
        audioFolder.addFile(new AudioFile("Classic.mp3"));
    }

    @Test
    public void testEncryptDecrypt() throws Exception {
        String encryptString;
        String decryptString;
        String text;
        text = audioFolder.showListOfFiles();
        encryptString=Cryptographer.encrypt(text,CRYPT_POWER);
        decryptString=Cryptographer.decrypt(encryptString,CRYPT_POWER);
        Assert.assertEquals(text, decryptString);
    }
}
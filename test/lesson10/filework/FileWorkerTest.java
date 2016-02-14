package lesson10.filework;

import org.junit.Assert;
import org.junit.Test;

public class FileWorkerTest {
    public static final int CRYPT_POWER = 114;
    public static final boolean ENCRYPT = true;
    public static final String FILE_NAME = "CryptedText.txt";

    @Test
    public void testWriteReadFile() throws Exception {
        String text = "... Ad cogitandum et agendum homo natus est ...";
        text = Cryptographer.crypt(text, CRYPT_POWER, ENCRYPT);
        FileWorker.writeToFile(FILE_NAME, text);
        text = FileWorker.readFromFile(FILE_NAME);
        String cryptedtext = "... Kn myqsdkxnew od kqoxnew rywy xkdec ocd ...";
        Assert.assertEquals(cryptedtext, text);
    }
}
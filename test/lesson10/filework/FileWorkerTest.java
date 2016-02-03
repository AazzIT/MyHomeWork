package lesson10.filework;

import org.junit.Assert;
import org.junit.Test;

public class FileWorkerTest {
    public static final int CRYPT_POWER = 114;
    public static boolean ENCRYPT = true;
    public static final String FILE_NAME = "CryptedText.txt";

    private String text = "... Ad cogitandum et agendum homo natus est ...";
    private String cryptedText = "... Kn myqsdkxnew od kqoxnew rywy xkdec ocd ...";

    @Test
    public void testWriteReadFile() throws Exception {
        text = Cryptographer.crypt(text, CRYPT_POWER, ENCRYPT);
        FileWorker.writeToFile(FILE_NAME, text);

        text = FileWorker.readFromFile(FILE_NAME);

        Assert.assertEquals("OK: ", cryptedText, text);
    }
}
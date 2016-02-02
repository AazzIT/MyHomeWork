package lesson10.filework;

import org.junit.Assert;
import org.junit.Test;

public class CryptographerTest {
    public static final int CRYPT_POWER = 114;
    public static boolean ENCRYPT = true;
    public static boolean DECRYPT = false;

    private String text = "... Ad cogitandum et agendum homo natus est ...";
    private String cryptedText = "... Kn myqsdkxnew od kqoxnew rywy xkdec ocd ...";

    @Test(timeout = 3000)
    public void testCrypt() throws Exception {
        String result = Cryptographer.crypt(text, CRYPT_POWER, ENCRYPT);
        Assert.assertEquals("", cryptedText, result);
        result = Cryptographer.crypt(cryptedText, CRYPT_POWER, DECRYPT);
        Assert.assertEquals("", text, result);
    }
}
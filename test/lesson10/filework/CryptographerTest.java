package lesson10.filework;

import org.junit.Assert;
import org.junit.Test;

public class CryptographerTest {
    public static final int CRYPT_POWER = 114;
    public static final boolean ENCRYPT = true;
    public static final boolean DECRYPT = false;

    String text = "... Ad cogitandum et agendum homo natus est ...";
    String cryptedText = "... Kn myqsdkxnew od kqoxnew rywy xkdec ocd ...";

    @Test(timeout = 3000)
    public void testEncrypt() throws Exception {
        String result = Cryptographer.crypt(text, CRYPT_POWER, ENCRYPT);
        Assert.assertEquals(cryptedText, result);
    }

    @Test(timeout = 3000)
    public void testDecrypt() throws Exception {
        String result = Cryptographer.crypt(cryptedText, CRYPT_POWER, DECRYPT);
        Assert.assertEquals(text, result);
    }
}
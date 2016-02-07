package lesson10.filework;

import org.junit.Assert;
import org.junit.Test;

public class CryptographerTest {
    public static final int CRYPT_POWER = 114;
    public static boolean ENCRYPT = true; //заглавными буквами именуются только константы (public static final), без final -
    //это уже не константа, а обычная переменная.
    public static boolean DECRYPT = false;

    private String text = "... Ad cogitandum et agendum homo natus est ...";//Идея предлагает тебе конвертировать данные переменные в
    //локальные переменные - почему? расскажи мне.
    private String cryptedText = "... Kn myqsdkxnew od kqoxnew rywy xkdec ocd ...";

    @Test(timeout = 3000)
    public void testCrypt() throws Exception {
        String result = Cryptographer.crypt(text, CRYPT_POWER, ENCRYPT);
        Assert.assertEquals("", cryptedText, result);// о чем говорит первый параметр - пустые кавычки? расскажи. Зачем ты их используешь?
        result = Cryptographer.crypt(cryptedText, CRYPT_POWER, DECRYPT);// я бы разбила это на два метода-теста. По одному assert на метод -
        //best practice
        Assert.assertEquals("", text, result);
    }
}
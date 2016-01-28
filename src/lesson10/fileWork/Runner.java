package lesson10.fileWork;

public class Runner {
    public static final int CRYPT_POWER = 114;
    public static final String FILE_NAME = "CryptedText.txt";
    public static boolean ENCRYPT = true;
    public static boolean DECRYPT = false;

    public static void main(String[] args) {
        String text = "... Ad cogitandum et agendum homo natus est ...";
        System.out.println("Not encrypted string for write to file: " + text);

        text = Cryptographer.crypt(text, CRYPT_POWER, ENCRYPT);
        System.out.println("Encrypted string for write to file: " + text);
        FileWorker.writeToFile(FILE_NAME, text);

        text = FileWorker.readFromFile(FILE_NAME);
        System.out.println("Encrypted string read from file: " + text);

        text = Cryptographer.crypt(text, CRYPT_POWER, DECRYPT);
        System.out.println("Decrypted string read from file: " + text);

        System.out.println();
    }
}


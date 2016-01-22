package lesson9;

public class Runner {
    public static final int CRYPT_POWER = 114;

    public static void main(String[] args) {
        String stringForCrypt = "KRaKOZzYABrA";
        System.out.println("String before Encrypt: " + stringForCrypt + "\n" +
                "String after  Encrypt: " + Cryptographer.encrypt(stringForCrypt, CRYPT_POWER) + "\n" +
                "String after  Decrypt: " + Cryptographer.decrypt(Cryptographer.encrypt(stringForCrypt, CRYPT_POWER), CRYPT_POWER));
    }
}
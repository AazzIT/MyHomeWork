package lesson9;

public class Cryptographer {
    public static final int ALPHABET_COUNT = 26;
    public static final int ASCII_CODE_A = 65;
    public static final int ASCII_CODE_a = 97;
    //public static StringBuilder intervalOfChars = new StringBuilder().append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    public static StringBuilder intervalOfChars = new StringBuilder().append("abcdefghijklmnopqrstuvwxyz");

    public static String encrypt (String stringForEncrypt, int encryptCode) {
        String resultString = "";
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if ((int) stringForEncrypt.charAt(i) >= 97) {
                resultString += (char) (ASCII_CODE_a + (intervalOfChars.indexOf(String.valueOf(stringForEncrypt.charAt(i))) + encryptCode) % ALPHABET_COUNT);
            } else {
                resultString += (char) (ASCII_CODE_A + (intervalOfChars.indexOf(String.valueOf(Character.toLowerCase(stringForEncrypt.charAt(i)))) + encryptCode) % ALPHABET_COUNT);
            }
        }
        return resultString;
    }

    public static String decrypt (String stringForEncrypt, int encryptCode) {
        String resultString = "";
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if ((int) stringForEncrypt.charAt(i) >= 97) {
                resultString += (char) (ASCII_CODE_a + (intervalOfChars.indexOf(String.valueOf(stringForEncrypt.charAt(i))) - encryptCode) % ALPHABET_COUNT);
            } else {
                int count = (intervalOfChars.indexOf(String.valueOf(Character.toLowerCase(stringForEncrypt.charAt(i)))) - encryptCode) % ALPHABET_COUNT;

                resultString += (char) (ASCII_CODE_A + count);
            }
        }
        return resultString;
    }
}

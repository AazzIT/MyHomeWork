package lesson9;

public class Cryptographer {
    public static final int ALPHABET_COUNT = 26;
    public static final int ASCII_CODE_A = 65;
    public static final int ASCII_CODE_a = 97;
    public static StringBuilder alphabet = new StringBuilder().append("abcdefghijklmnopqrstuvwxyz");

    public static String encrypt (String stringForEncrypt, int cryptPower) { //лишний пробел между именем метода и скобкой
        String resultString = "";
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if ((int) stringForEncrypt.charAt(i) >= ASCII_CODE_a) {
                resultString += (char) (ASCII_CODE_a + (alphabet
                        .indexOf(String
                                .valueOf(stringForEncrypt
                                        .charAt(i))) + cryptPower) % ALPHABET_COUNT);
            } else {
                resultString += (char) (ASCII_CODE_A + (alphabet
                        .indexOf(String
                                .valueOf(Character
                                        .toLowerCase(stringForEncrypt
                                                .charAt(i)))) + cryptPower) % ALPHABET_COUNT);
            }
        }
        return resultString;
    } //кто тебя таким переносам научил?)))) Читать очень сложно. паровозы нереальные

    public static String decrypt (String stringForEncrypt, int cryptPower) {
        String resultString = "";
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if ((int) stringForEncrypt.charAt(i) >= ASCII_CODE_a) {
                resultString += (char) (ASCII_CODE_a + (alphabet
                        .indexOf(String
                                .valueOf(stringForEncrypt
                                        .charAt(i))) - cryptPower + ALPHABET_COUNT *
                        (1 + cryptPower/ALPHABET_COUNT)) % ALPHABET_COUNT);
            } else {
                int count = (alphabet
                        .indexOf(String
                                .valueOf(Character
                                        .toLowerCase(stringForEncrypt
                                                .charAt(i)))) - cryptPower + ALPHABET_COUNT *
                        (1 + cryptPower/ALPHABET_COUNT)) % ALPHABET_COUNT;
                resultString += (char) (ASCII_CODE_A + count);
            }
        }
        return resultString;
    }
}

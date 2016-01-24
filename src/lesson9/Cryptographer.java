package lesson9;

public class Cryptographer {
    public static final int ALPHABET_COUNT = 26;
    public static final int ASCII_CODE_A = 65;
    public static final int ASCII_CODE_a = 97;
    public static StringBuilder alphabet = new StringBuilder().append("abcdefghijklmnopqrstuvwxyz");

    public static String encrypt(String stringForEncrypt, int cryptPower) {
        String resultString = "";
        int charNumberInAlphabet;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if ((int) stringForEncrypt.charAt(i) >= ASCII_CODE_a) {
                charNumberInAlphabet = getCharNumberInAlphabetForEncrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else {
                charNumberInAlphabet = getCharNumberInAlphabetForEncrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_A + charNumberInAlphabet);
            }
        }
        return resultString;
    }

    public static String decrypt(String stringForEncrypt, int cryptPower) {
        String resultString = "";
        int charNumberInAlphabet;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if ((int) stringForEncrypt.charAt(i) >= ASCII_CODE_a) {
                charNumberInAlphabet = getCharNumberInAlphabetForDecrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else {
                charNumberInAlphabet = getCharNumberInAlphabetForDecrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_A + charNumberInAlphabet);
            }
        }
        return resultString;
    }

    private static int getCharNumberInAlphabetForEncrypt(char charForEncrypt, int cryptPower) {
        String charInAlphabet;
        int charNumberInAlphabet;
        charForEncrypt = Character.toLowerCase(charForEncrypt);
        charInAlphabet = String.valueOf(charForEncrypt);
        charNumberInAlphabet = alphabet.indexOf(charInAlphabet);
        return (charNumberInAlphabet + cryptPower) % ALPHABET_COUNT;
    }

    private static int getCharNumberInAlphabetForDecrypt(char charForEncrypt, int cryptPower) {
        String charInAlphabet;
        int charNumberInAlphabet;
        charForEncrypt = Character.toLowerCase(charForEncrypt);
        charInAlphabet = String.valueOf(charForEncrypt);
        charNumberInAlphabet = alphabet.indexOf(charInAlphabet);
        return (charNumberInAlphabet - cryptPower + ALPHABET_COUNT * (1 + cryptPower/ALPHABET_COUNT)) % ALPHABET_COUNT;
    }
}

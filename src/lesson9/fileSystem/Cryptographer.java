package lesson9.fileSystem;

public class Cryptographer {
    public static final int ALPHABET_COUNT = 26;
    public static final int ASCII_CODE_A = 65;
    public static final int ASCII_CODE_a = 97;
    public static StringBuilder alphabet = new StringBuilder().append("abcdefghijklmnopqrstuvwxyz");

    public static String encrypt(String stringForEncrypt, int cryptPower) {
        String resultString = "";
        int charNumberInAlphabet;
        for (int i = 0; i < stringForEncrypt.length(); i++) {

            if (((int) stringForEncrypt.charAt(i) >= ASCII_CODE_a) & ((int) stringForEncrypt.charAt(i) <= ASCII_CODE_a + ALPHABET_COUNT)) {
                //Такой иф очень сложно читать - длинно. Можно вынести до ифа в отдельные булевые переменные каждую из частей "и"
                //И тогда в самом ифе указывать только эти переменные
                charNumberInAlphabet = getCharNumberInAlphabetForEncrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else if (((int) stringForEncrypt.charAt(i) >= ASCII_CODE_A) & ((int) stringForEncrypt.charAt(i) <= ASCII_CODE_A + ALPHABET_COUNT)){
                charNumberInAlphabet = getCharNumberInAlphabetForEncrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_A + charNumberInAlphabet);
            } else {
                resultString += stringForEncrypt.charAt(i);
            }
        }
        return resultString;
    }

    public static String decrypt(String stringForEncrypt, int cryptPower) {
        String resultString = "";
        int charNumberInAlphabet;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            if (((int) stringForEncrypt.charAt(i) >= ASCII_CODE_a) & ((int) stringForEncrypt.charAt(i) <= ASCII_CODE_a + ALPHABET_COUNT)) {
                charNumberInAlphabet = getCharNumberInAlphabetForDecrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else if (((int) stringForEncrypt.charAt(i) >= ASCII_CODE_A) & ((int) stringForEncrypt.charAt(i) <= ASCII_CODE_A + ALPHABET_COUNT)){
                charNumberInAlphabet = getCharNumberInAlphabetForDecrypt(stringForEncrypt.charAt(i),cryptPower);
                resultString += (char) (ASCII_CODE_A + charNumberInAlphabet);
            } else {
                resultString += stringForEncrypt.charAt(i);
            }
        }
        return resultString;
    }

    private static int getCharNumberInAlphabetForEncrypt(char charForEncrypt, int cryptPower) {
        String charInAlphabet; //не нужно отдельно объявлять переменную, если ты ей тут же будешь присваивать значение
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

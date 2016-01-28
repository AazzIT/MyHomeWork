package lesson10.fileWork;

public class Cryptographer {
    public static final int ALPHABET_COUNT = 26;
    public static final int ASCII_CODE_A = 65;
    public static final int ASCII_CODE_a = 97;
    public static StringBuilder alphabet = new StringBuilder().append("abcdefghijklmnopqrstuvwxyz");

    public static String encrypt(String stringForEncrypt, int cryptPower) { //посчитай, сколько у тебя одинаковых строк в
        //методах encrypt и decrypt и сколько разных. Надо-надо выносить дублирование кода!!!
        String resultString = "";
        int charNumberInAlphabet;
        int charASCIIForEncrypt;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            charNumberInAlphabet = getCharNumberInAlphabetForEncrypt(stringForEncrypt.charAt(i),cryptPower);
            charASCIIForEncrypt = (int) stringForEncrypt.charAt(i);
            if (isLetter(charASCIIForEncrypt) & (charASCIIForEncrypt >= ASCII_CODE_a)) {
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else if (isLetter(charASCIIForEncrypt) & (charASCIIForEncrypt >= ASCII_CODE_A)){
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
        int charASCIIForEncrypt;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            charNumberInAlphabet = getCharNumberInAlphabetForDecrypt(stringForEncrypt.charAt(i),cryptPower);
            charASCIIForEncrypt = (int) stringForEncrypt.charAt(i);
            if (isLetter(charASCIIForEncrypt) & (charASCIIForEncrypt >= ASCII_CODE_a)) {
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else if (isLetter(charASCIIForEncrypt) & (charASCIIForEncrypt >= ASCII_CODE_A)){
                resultString += (char) (ASCII_CODE_A + charNumberInAlphabet);
            } else {
                resultString += stringForEncrypt.charAt(i);
            }
        }
        return resultString;
    }

    public static boolean isLetter(int charASCIICode) {
        boolean isCharASCIICodeMorea;
        boolean isCharASCIICodeLessa;
        boolean isCharASCIICodeMoreA;
        boolean isCharASCIICodeLessA;
        isCharASCIICodeMorea = charASCIICode >= ASCII_CODE_a;
        isCharASCIICodeLessa = charASCIICode <= ASCII_CODE_a + ALPHABET_COUNT;
        isCharASCIICodeMoreA = charASCIICode >= ASCII_CODE_A;
        isCharASCIICodeLessA = charASCIICode <= ASCII_CODE_A + ALPHABET_COUNT;
        return isCharASCIICodeMorea & isCharASCIICodeLessa || isCharASCIICodeMoreA & isCharASCIICodeLessA;
    }

    private static int getCharNumberInAlphabetForEncrypt(char charForEncrypt, int cryptPower) {//и сколько общего между этим
        // и ниже методом - разница в одну строку. Может тоже можно что-то выделить общее в отдельный метод?
        charForEncrypt = Character.toLowerCase(charForEncrypt);
        String charInAlphabet = String.valueOf(charForEncrypt);
        int charNumberInAlphabet = alphabet.indexOf(charInAlphabet);
        return (charNumberInAlphabet + cryptPower) % ALPHABET_COUNT;
    }

    private static int getCharNumberInAlphabetForDecrypt(char charForEncrypt, int cryptPower) {
        charForEncrypt = Character.toLowerCase(charForEncrypt);
        String charInAlphabet = String.valueOf(charForEncrypt);
        int charNumberInAlphabet = alphabet.indexOf(charInAlphabet);
        return (charNumberInAlphabet - cryptPower + ALPHABET_COUNT * (1 + cryptPower/ALPHABET_COUNT)) % ALPHABET_COUNT;
    }
}

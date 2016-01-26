package lesson9.fileSystem;

public class Cryptographer {
    public static final int ALPHABET_COUNT = 26;
    public static final int ASCII_CODE_A = 65;
    public static final int ASCII_CODE_a = 97;
    public static StringBuilder alphabet = new StringBuilder().append("abcdefghijklmnopqrstuvwxyz");

    public static String encrypt(String stringForEncrypt, int cryptPower) { //можно подумать о рефакторинге этих двух методов
        //вынести дублирование кода
        String resultString = "";
        int charNumberInAlphabet;
        int charASCIIForEncrypt;
        boolean isCharASCIICodeUppera;
        boolean isCharASCIICodeLowera;
        boolean isCharASCIICodeUpperA;
        boolean isCharASCIICodeLowerA;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            charNumberInAlphabet = getCharNumberInAlphabetForEncrypt(stringForEncrypt.charAt(i),cryptPower);
            charASCIIForEncrypt = (int) stringForEncrypt.charAt(i);
            isCharASCIICodeUppera = charASCIIForEncrypt >= ASCII_CODE_a;
            isCharASCIICodeLowera = charASCIIForEncrypt <= ASCII_CODE_a + ALPHABET_COUNT;
            isCharASCIICodeUpperA = charASCIIForEncrypt >= ASCII_CODE_A;
            isCharASCIICodeLowerA = charASCIIForEncrypt <= ASCII_CODE_A + ALPHABET_COUNT;
            if (isCharASCIICodeUppera & isCharASCIICodeLowera) {
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else if (isCharASCIICodeUpperA & isCharASCIICodeLowerA){
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
        boolean isCharASCIICodeUppera; //плиз переименуй на more и less
        boolean isCharASCIICodeLowera;
        boolean isCharASCIICodeUpperA;
        boolean isCharASCIICodeLowerA;
        for (int i = 0; i < stringForEncrypt.length(); i++) {
            charNumberInAlphabet = getCharNumberInAlphabetForDecrypt(stringForEncrypt.charAt(i),cryptPower);
            charASCIIForEncrypt = (int) stringForEncrypt.charAt(i);
            isCharASCIICodeUppera = charASCIIForEncrypt >= ASCII_CODE_a;
            isCharASCIICodeLowera = charASCIIForEncrypt <= ASCII_CODE_a + ALPHABET_COUNT;
            isCharASCIICodeUpperA = charASCIIForEncrypt >= ASCII_CODE_A;
            isCharASCIICodeLowerA = charASCIIForEncrypt <= ASCII_CODE_A + ALPHABET_COUNT;
            if (isCharASCIICodeUppera & isCharASCIICodeLowera) {
                resultString += (char) (ASCII_CODE_a + charNumberInAlphabet);
            } else if (isCharASCIICodeUpperA & isCharASCIICodeLowerA){
                resultString += (char) (ASCII_CODE_A + charNumberInAlphabet);
            } else {
                resultString += stringForEncrypt.charAt(i);
            }
        }
        return resultString;
    }

    private static int getCharNumberInAlphabetForEncrypt(char charForEncrypt, int cryptPower) {
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

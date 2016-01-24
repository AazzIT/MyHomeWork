package lesson9;

import lesson9.fileSystem.Cryptographer;

public class Runner {
    public static final int CRYPT_POWER = 114;

    public static void main(String[] args) {
        String stringForCrypt = "KRaKOZzYABrA";
        System.out.println("String before Encrypt: " + stringForCrypt + "\n" +
                "String after  Encrypt: " + Cryptographer.encrypt(stringForCrypt, CRYPT_POWER) + "\n" +
                "String after  Decrypt: " + Cryptographer.decrypt(Cryptographer.encrypt(stringForCrypt, CRYPT_POWER), CRYPT_POWER));
    }// и здесь паровозы. Разбивай, плиз, на последовательные действия. Ты тут лишний раз вызываешь один и тот же метод, потому что
    //поленился сохранить значение во временную переменную.
    //Зачада звучала немного по-другому
    //Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java
}
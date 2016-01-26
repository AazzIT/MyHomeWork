package lesson10.fileWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static final int CRYPT_POWER = 114;

    public static void main(String[] args) throws IOException { //Я бы вынесла операции с файлом, стримами в отдельный класс
        //а в мейне оставить принты и создание-запуск проекта.
        StringBuilder text = new StringBuilder().append("... Ad cogitandum et agendum homo natus est ...");
        FileReader inputStream = null;
        FileWriter outputStream = null;
        System.out.println("Not encrypted string for write to file: " + text);
        try {
            outputStream = new FileWriter("Encode.txt");
            for (int i = 0; i < text.length(); i++) {
                outputStream.append(Cryptographer.encrypt(String.valueOf(text.toString().charAt(i)), CRYPT_POWER));
            } //ох и паровозик!!!! Закон Деметры!!!))) Разбей, плиз на вызовы методов по одному
            outputStream.close();

            inputStream = new FileReader("Encode.txt");
            int c;
            text.delete(0, text.length());
            while ((c = inputStream.read()) != -1) {
                text.append((char) c);
            }
            inputStream.close(); //почему закрываешь в трай, а потом еще в файнали?? Помоему, здесь лишнее.
            System.out.println("Encrypted string read from file: " + text);
            System.out.println("Decrypted string read from file: " + Cryptographer.decrypt(text.toString(), CRYPT_POWER));
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!" + e);
        } catch (IOException e) {
            System.out.println("Error: Something is wrong....!" + e);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println();
    }
}

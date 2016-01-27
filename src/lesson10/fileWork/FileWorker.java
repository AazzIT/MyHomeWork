package lesson10.fileWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWorker {
    public static void writeToFile(String fileName, String text) {
        FileWriter outputStream = null;
        try {
            outputStream = new FileWriter(fileName);
            for (int i = 0; i < text.length(); i++) {
                outputStream.append(text.charAt(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found:" + e);
        } catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            }
        }
    }

    public static String readFromFile(String fileName) {
        FileReader inputStream = null;
        String result = "";
        try {
            inputStream = new FileReader(fileName);
            int c;
            while ((c = inputStream.read()) != -1) {
                result += (char) c;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found:" + e);
        } catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        return result;
    }
}

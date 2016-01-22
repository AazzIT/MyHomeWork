package lesson9;

public class Runner {
    public static void main(String[] args) {
        String s = "KRaKOZzYABrA";
        System.out.println(s + "    " + Cryptographer.encrypt(s, 31) + "    " + Cryptographer.decrypt(Cryptographer.encrypt(s, 31), 31));
        System.out.println(- 10 % 6);
    }
}



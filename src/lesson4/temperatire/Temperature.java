package lesson4.temperatire;

public class Temperature {
    public static double fahrenheit(double celcius) {
        return celcius * 1.8 + 32;
    }

    public static double celcius(double fahrenheit) {
        return (fahrenheit-32)/1.8;
    }

}

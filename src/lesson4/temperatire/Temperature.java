package lesson4.temperatire;

public class Temperature {
    public static double toFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double toCelcius(double fahrenheit) {
        return (fahrenheit-32)/1.8;
    }

}

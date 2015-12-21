package lesson4.temperatire;

public class Temperature {
    public static double fahrenheit(double celcius) {//Гугл в помощь Celsius
        return celcius * 1.8 + 32;
    }

    public static double celcius(double fahrenheit) {//методы надо именовать с глагола
        return (fahrenheit-32)/1.8;
    }

}

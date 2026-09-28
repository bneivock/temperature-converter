import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a temperature in Celsius");
        double celcius = Double.valueOf(scanner.nextLine());
        double fahrenheit = (celcius * 1.8) + 32;
        double kelvin = celcius + 273.15;
        System.out.println("You wrote " + celcius + "ºC");
        System.out.println("Which converts to " + fahrenheit + "ºF");
        System.out.println("Or converts to " + kelvin + "K");
    }
}
package infotech;
import java.util.Scanner;

public class SoftwareDevelopment {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double celsius, fahrenheit, kelvin;

        switch (unit) {
            case 'C':
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case 'F':
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case 'K':
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2fK%n", kelvin);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

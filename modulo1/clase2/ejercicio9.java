import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);

        while (condition) {
            System.out.println("------------");
            System.out.println("----Menu----");
            System.out.println("::::::::::::");
            System.out.println("Welcome to temperature converter");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Kelvin to Celsius");
            System.out.println("3. Exit");
            int val = scanner.nextInt();
            scanner.close();

            if (val == 1) {
                System.out.println("Introduce el valor en Fahrenheit que desea convertir:");
                double fahrenheit = scanner.nextDouble();
                double resultado = fahrenheitToCelsius(fahrenheit);
                System.out.println("El resultado es " + resultado);
            } else if (val == 2) {
                System.out.println("Introduce el valor en Kelvin que desea convertir:");
                double kelvin = scanner.nextDouble();
                double resultado = kelvinToCelsius(kelvin);
                System.out.println("El resultado es " + resultado);
            } else if (val == 3) {
                condition = false;
                System.out.println("Exit...");
            } else {
                System.err.println("Invalid parameter, please try again.");
            }
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

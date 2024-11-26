import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Metros a kilómetros");
        System.out.println("2. Kilómetros a metros");
        System.out.println("3. Gramos a kilogramos");
        System.out.println("4. Kilogramos a gramos");
        int validacion = scanner.nextInt();

        if (validacion == 1) {
            System.out.print("Por favor, introduce los metros: ");
            double num = scanner.nextDouble();
            double resultado = obtenerKilometros(num);
            System.out.println("La conversión es igual a " + resultado + " Km");
        } else if (validacion == 2) {
            System.out.print("Por favor, introduce los kilómetros: ");
            double num = scanner.nextDouble();
            double resultado = obtenerMetros(num);
            System.out.println("La conversión es igual a " + resultado + " M");
        } else if (validacion == 3) {
            System.out.print("Por favor, introduce los gramos: ");
            double num = scanner.nextDouble();
            double resultado = obtenerKilogramos(num);
            System.out.println("La conversión es igual a " + resultado + " Kg");
        } else if (validacion == 4) {
            System.out.print("Por favor, introduce los kilogramos: ");
            double num = scanner.nextDouble();
            double resultado = obtenerGramos(num);
            System.out.println("La conversión es igual a " + resultado + " g");
        } else {
            System.out.println("Solo son válidos los números del 1 al 4.");
        }
        
        scanner.close();
    }

    public static double obtenerKilometros(double metros) {
        return metros / 1000;
    }

    public static double obtenerMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double obtenerKilogramos(double gramos) {
        return gramos / 1000;
    }

    public static double obtenerGramos(double kilogramos) {
        return kilogramos * 1000;
    }
}

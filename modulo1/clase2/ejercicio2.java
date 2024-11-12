import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en gramos para averiguar el precio:");
        double gramos = scanner.nextDouble();
        scanner.close();

        double resultado = calcularPrecio(gramos);
        System.out.printf("El precio para %.2f gramos es: %.2f€%n", gramos, resultado);
    }

    public static double calcularPrecio(double gramos) {
        double precioPor100g = 5.95;
        return (precioPor100g / 100) * gramos;
    }
}

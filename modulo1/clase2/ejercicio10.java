import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los números para calcular la media aritmética:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();
        scanner.close();

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.printf("La media aritmética de tus números es: %.2f%n", media);
    }
}

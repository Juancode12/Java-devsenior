import java.util.Scanner;
public class ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir la base: ");
        double base = scanner.nextInt();
        System.out.print("introducir el exponente: ");
        double exponente = scanner.nextInt();
        scanner.close();
        double resultado = potencia(base, exponente);
        System.out.println("la potencia es: " + resultado);
    }

    public static double potencia(double a, double b){
        return Math.pow(a, b);

    }
}

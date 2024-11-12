import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cond = true;
        
        while (cond) {
            System.out.println("Ingresar un número, para salir del bucle insertar un número negativo:");
            double num = scanner.nextDouble();
            double resultado = cubo(num);
            System.out.println("El cubo de " + num + " es " + resultado);

            if (num < 0) {
                cond = false;
            }
        }
        
        scanner.close();
    }

    public static double cubo(double a) {
        return Math.pow(a, 3);
    }
}

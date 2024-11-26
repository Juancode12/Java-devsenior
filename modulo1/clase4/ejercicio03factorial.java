import java.util.Scanner;

public class ejercicio03factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número para calcular su factorial:");
        int factorial = scanner.nextInt();
        if (factorial >= 0) {
            int resultado = obtenerFactorial(factorial);
            System.out.println("El resultado del factorial ingresado es " + resultado);
        } else {
            System.out.println("No es posible realizar el cálculo con un número negativo.");
        }
        scanner.close();
    }

    public static int obtenerFactorial(int a) {
        int resultado = 1;
        for (int i = 1; i <= a; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

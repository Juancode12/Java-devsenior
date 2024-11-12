import java.util.Scanner;
import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 3 números enteros diferentes:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        String resultado = obtenerNumerosOrdenadosYConcatenados(num1, num2, num3);
        System.out.println("Los números ordenados y concatenados son: " + resultado);
    }

    public static String obtenerNumerosOrdenadosYConcatenados(int a, int b, int c) {
        int[] numeros = {a, b, c};
        Arrays.sort(numeros); // Ordenar el array en orden ascendente

        // Concatenar los números sin usar un bucle for
        String concatenado = "" +  numeros[0] + numeros[1] + numeros[2];

        return concatenado;
    }
}
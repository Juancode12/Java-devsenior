import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir el número de los hermanos (1-3):");
        int hermano = scanner.nextInt();
        int hermano2 = scanner.nextInt();
        scanner.close();
        
        int resultado = obtenerHermano(hermano, hermano2);
        if (resultado != -1) {
            System.out.println("El hermano que llega tarde es: " + resultado);
        } else {
            System.out.println("Entrada inválida.");
        }
    }

    public static int obtenerHermano(int a, int b) {
        if (a == 1 && b == 2 || a == 2 && b == 1) {
            return 3;
        } else if (a == 2 && b == 3 || a == 3 && b == 2) {
            return 1;
        } else if (a == 3 && b == 1 || a == 1 && b == 3) {
            return 2;
        } else {
            return -1; // Valor de retorno para entrada inválida
        }
    }
}

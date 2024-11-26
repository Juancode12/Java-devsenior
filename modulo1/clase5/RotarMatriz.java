import java.util.Scanner;

public class RotarMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introducir las filas: ");
        int filas = scanner.nextInt();
        System.out.print("Introducir las columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Ingresar valores en la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Introducir el valor para la fila %d, columna %d: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

    
        int[][] matrizRotada = rotarMatriz90Grados(matriz);

        System.out.println("Matriz rotada 90 grados:");
        imprimirMatriz(matrizRotada);

        scanner.close();
    }

    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

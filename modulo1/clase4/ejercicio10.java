import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        
        generarTablaMultiplicar(numero);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }

    public static void generarTablaMultiplicar(int numero) {
        System.out.printf("Tabla de multiplicar del %d:%n", numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
    }
}

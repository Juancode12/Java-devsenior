import java.util.Scanner;

public class ejercicio12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir los segundos: ");
        double segundos = scanner.nextDouble();
        
        double resultadoDias = obtenerDias(segundos);
        System.out.printf("El resultado en días es: %.2f días%n", resultadoDias);
        
        double resultadoHoras = obtenerHoras(segundos);
        System.out.printf("El resultado en horas es: %.2f horas%n", resultadoHoras);
        
        double resultadoMinutos = obtenerMinutos(segundos);
        System.out.printf("El resultado en minutos es: %.2f minutos%n", resultadoMinutos);
        
        scanner.close();
    }
    
    public static double obtenerDias(double segundos) {
        return segundos / 86400;
    }

    public static double obtenerHoras(double segundos) {
        return segundos / 3600;
    }

    public static double obtenerMinutos(double segundos) {
        return segundos / 60;
    }
}

import java.util.Scanner;

public class ejercicio09 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("1. Interés simple");
        System.out.println("2. Interés compuesto");
        int condition = scanner.nextInt();
        
        if (condition == 1) {
            System.out.print("Ingresa el monto de capital: ");
            double capital = scanner.nextDouble();
            System.out.print("Ingresa la tasa de interés anual (%): ");
            double interes = scanner.nextDouble() / 100;
            System.out.print("Ingresa el tiempo en años: ");
            int tiempo = scanner.nextInt();
            double resultado = interesSimple(capital, interes, tiempo);
            System.out.println("El interés simple es " + resultado);
        } else if (condition == 2) {
            System.out.print("Ingresa el monto de capital: ");
            double capital = scanner.nextDouble();
            System.out.print("Ingresa la tasa de interés anual (%): ");
            double interes = scanner.nextDouble() / 100;
            System.out.print("Ingresa el tiempo en años: ");
            int tiempo = scanner.nextInt();
            System.out.print("Ingresa el número de veces que se aplica el interés por año: ");
            int interesTiempo = scanner.nextInt();
            double resultado = interesCompuesto(capital, interes, tiempo, interesTiempo);
            System.out.println("El interés compuesto es " + resultado);
        } else {
            System.out.println("Parámetro inválido, solo se puede introducir un número del 1 al 2");
        }

        scanner.close();
      }
        
    public static double interesSimple(double p, double r, int t) {
        return p * r * t;
    }

    public static double interesCompuesto(double p, double r, int t, int n) {
        return p * Math.pow((1 + r / n), n * t);
    }
}

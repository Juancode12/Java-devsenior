import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("1. Área del círculo");
        System.out.println("2. Área del cuadrado");
        System.out.println("3. Área del triángulo");
        
        int validacion = scanner.nextInt();

        if (validacion == 1) {
            System.out.print("Introduce el radio del círculo: ");
            int radio = scanner.nextInt();
            double resultado = areaCirculo(radio);
            System.out.println("El área del círculo es " + resultado + " unidades cuadradas.");
        } else if (validacion == 2) {
            System.out.print("Introduce el lado del cuadrado: ");
            int lado = scanner.nextInt();
            double resultado = areaCuadrado(lado);
            System.out.println("El área del cuadrado es " + resultado + " unidades cuadradas.");
        } else if (validacion == 3) {
            System.out.print("Introduce la base del triángulo: ");
            int base = scanner.nextInt();
            System.out.print("Introduce la altura del triángulo: ");
            int altura = scanner.nextInt();
            double resultado = areaTriangulo(base, altura);
            System.out.println("El área del triángulo es " + resultado + " unidades cuadradas.");
        } else {
            System.out.println("Solo están permitidos números del 1 al 3. Vuelve a intentar.");
        }

        scanner.close();
    }

    public static double areaCirculo(int radio) {
        double pi = 3.1415;
        return pi * Math.pow(radio, 2);
    }

    public static double areaCuadrado(int lado) {
        return Math.pow(lado, 2);
    }

    public static double areaTriangulo(int base, int altura) {
        return (base * altura) / 2.0;
    }
}

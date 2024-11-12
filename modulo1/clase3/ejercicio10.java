


import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el mes:");
        int mes = scanner.nextInt();
        scanner.close();

        String dias = obtenerMes(mes);
        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }

    public static String obtenerMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return "31";
            case 4: case 6: case 9: case 11:
                return "30";
            case 2:
                return "28";
            default:
                return "Número de mes inválido";
        }
    }
}

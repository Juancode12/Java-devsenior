import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Ingresar los números (ingresar doble 00 para salir): ");
            int number = scanner.nextInt();
            
            if (number == 00) {
                break;
            }
            
            addNumber(list, number);
            printList(list);
        }
        
        scanner.close();

        System.out.println("Lista de números:");
        printList(list);
    }

    public static boolean addNumber(ArrayList<Integer> list, int number) {
        return list.add(number);
    }

    public static String checkDuplicate(ArrayList<Integer> list, int a) {
        if (list.contains(a)) {
            return "Sí está duplicado";
        } else {
            return "No hay duplicados";
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println("Los elementos fueron: " + i);
        }
    }
}

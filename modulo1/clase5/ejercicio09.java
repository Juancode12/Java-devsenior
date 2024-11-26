import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Añadir cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int validation = scanner.nextInt();
            scanner.nextLine();
            
            switch (validation) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String customer = scanner.nextLine();
                    addClient(cola, customer);
                    System.out.printf("El cliente %s fue añadido con éxito%n", customer);
                    printQueue(cola);
                    break;
                    
                case 2:
                    String resultado = attendClient(cola);
                    System.out.println(resultado);
                    printQueue(cola);
                    break;
                    
                case 3:
                    System.out.println("Salida exitosa!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static boolean addClient(Queue<String> cola, String customer) {
        return cola.offer(customer);
    }

    public static String attendClient(Queue<String> cola) {
        if (cola.isEmpty()) {
            return "No hay clientes actuales, añade uno nuevo!";
        } else {
            return "Atendiendo al cliente: " + cola.poll();
        }
    }

    public static void printQueue(Queue<String> cola) {
        System.out.println("Estado actual de la cola:");
        for (String cliente : cola) {
            System.out.println(cliente);
        }
    }
}

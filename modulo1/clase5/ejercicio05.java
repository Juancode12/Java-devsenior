import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();
       
        while (true) {
            System.out.println("\n1. Agregar nuevo documento");
            System.out.println("2. Eliminar documento");
            System.out.println("3. Mostrar documentos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int condition = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (condition) {
                case 1:
                    String resultado = agregarDocumentos(cola, scanner);
                    System.out.printf("%s fue agregado con éxito!%n", resultado);
                    break;
                case 2:
                    String eliminado = eliminarDocumento(cola);
                    if (eliminado != null) {
                        System.out.printf("%s fue eliminado con éxito!%n", eliminado);
                    } else {
                        System.out.println("No hay elementos para borrar.");
                    }
                    break;
                case 3:
                    mostrarDocumentos(cola);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static String agregarDocumentos(Queue<String> cola, Scanner scanner) {
        System.out.print("Introducir el nombre del documento: ");
        String documento = scanner.nextLine();
        cola.offer(documento);
        return documento;
    }

    public static String eliminarDocumento(Queue<String> cola) {
        return cola.poll(); // Devuelve el documento eliminado o null si la cola está vacía
    }

    public static void mostrarDocumentos(Queue<String> cola) {
        if (cola.isEmpty()) {
            System.out.println("No hay documentos en la cola.");
        } else {
            System.out.println("Documentos en la cola:");
            for (String documento : cola) {
                System.out.println(documento);
            }
        }
    }
}

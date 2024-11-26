import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Eliminar tarea completada");
            System.out.println("3. Mostrar tareas pendientes");
            System.out.println("4. Acceder a tarea específica");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            if (opcion == 1) {
                System.out.print("Ingrese la nueva tarea: ");
                String tarea = scanner.nextLine();
                lista.add(tarea);
                System.out.printf("'%s' ha sido agregada con éxito.%n", tarea);

            } else if (opcion == 2) {
                System.out.print("Ingrese el número de la tarea completada: ");
                int indiceEliminar = scanner.nextInt();
                if (indiceEliminar >= 0 && indiceEliminar < lista.size()) {
                    String tareaEliminada = lista.remove(indiceEliminar);
                    System.out.printf("'%s' ha sido eliminada.%n", tareaEliminada);
                } else {
                    System.out.printf("Número de tarea inválido: %d%n", indiceEliminar);
                }

            } else if (opcion == 3) {
                System.out.println("Tareas pendientes:");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.printf("%d. %s%n", i, lista.get(i));
                }

            } else if (opcion == 4) {
                System.out.print("Ingrese el número de la tarea a acceder: ");
                int indiceAcceder = scanner.nextInt();
                if (indiceAcceder >= 0 && indiceAcceder < lista.size()) {
                    System.out.printf("Tarea %d: %s%n", indiceAcceder, lista.get(indiceAcceder));
                } else {
                    System.out.printf("Número de tarea inválido: %d%n", indiceAcceder);
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo del gestor de tareas.");
                break;

            } else {
                System.out.printf("La opción %d no es válida, por favor introduzca un número válido.%n", opcion);
            }
        }

        scanner.close();
    }
}

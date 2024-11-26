import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir nuevo estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int elemento = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (elemento) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String estudiante = scanner.nextLine();
                    String resultado = addStudent(lista, estudiante);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.print("Nombre del estudiante a eliminar: ");
                    String deleteEstudiante = scanner.nextLine();
                    boolean resultadoDelete = deleteStudent(lista, deleteEstudiante);
                    System.out.println("El estudiante fue eliminado: " + resultadoDelete);
                    break;
                case 3:
                    System.out.println("Lista de estudiantes:");
                    String listaEstudiantes = mostrar(lista);
                    System.out.println(listaEstudiantes);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return; // Salir del bucle y terminar el programa
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static String addStudent(ArrayList<String> a, String estudiante) {
        if (a.add(estudiante)) {
            return "El estudiante " + estudiante + " fue agregado con éxito!";
        } else {
            return "Hubo un error al agregar al estudiante " + estudiante + ".";
        }
    }

    public static boolean deleteStudent(ArrayList<String> a, String estudiante) {
        return a.remove(estudiante);
    }

    public static String mostrar(ArrayList<String> a) {
        if (a.isEmpty()) {
            return "Lista vacía.";
        }
        StringBuilder sb = new StringBuilder();
        for (String estudiante : a) {
            sb.append(estudiante).append("\n");
        }
        return sb.toString();
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Añadir nuevas configuraciones");
            System.out.println("2. Actualizar funciones existentes");
            System.out.println("3. Mostrar configuraciones almacenadas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int condition = scanner.nextInt();
            scanner.nextLine();
            
            switch (condition) {
                case 1:
                    System.out.print("Nombre de la nueva configuración: ");
                    String name = scanner.nextLine();
                    boolean end = addConfiguration(list, name);
                    System.out.printf("La configuración %s fue agregada con éxito%n", name);
                    break;
                    
                case 2:
                    System.out.print("Actualizar configuración: ");
                    String add = scanner.nextLine();
                    System.out.print("Índice de la configuración: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    String configuration = update(list, add, index);
                    System.out.println(configuration);
                    break;
                    
                case 3:
                    System.out.println("Configuraciones almacenadas:");
                    printLoop(list);
                    break;
                    
                case 4:
                    System.out.println("Salida exitosa!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    
    public static boolean addConfiguration(List<String> list, String name) {
        return list.add(name);
    }

    public static String update(List<String> list, String add, int index) {
        if (index >= 0 && index < list.size()) {
            list.set(index, add);
            return "Configuración actualizada con éxito.";
        } else {
            return "Índice no válido.";
        }
    }

    public static void printLoop(List<String> list) {
        for (String i : list) {
            System.out.println(i);
        }
    }
}

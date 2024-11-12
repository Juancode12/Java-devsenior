import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número Real");
        int numeroEntero = scanner.nextInt();

        scanner.close(); 
        if (numeroEntero > 0) {
            System.out.println("el numero es positivo");
            
        }

        else if (numeroEntero < 0) {
            System.out.println("el numero es negativo");

        }

        else if (numeroEntero == 0){
            System.out.println("el numero es 0");
        }
        
        else{
            System.out.println("ha ocurrido un error inesperado");
        }
    }
}
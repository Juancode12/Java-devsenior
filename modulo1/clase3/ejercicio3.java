import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introducir numero");
        int num = scanner.nextInt();
        scanner.close();
        if (num % 2 == 0  ) {
            System.out.println("el numero es par");
            
        }

        if (num % 2 != 0  ) {
            System.out.println("el numero es impar");
            
        }

        else {
            System.out.println("el parametro es no valido");
        }
    }
}

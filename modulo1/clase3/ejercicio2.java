import java.util.Scanner;
public class ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir 1 numero");

        int num1 = scanner.nextInt();

        System.out.println("Introducir 2 numero");

        int num2 = scanner.nextInt();


        System.out.println("Introducir 3 numero");
        
        int num3 = scanner.nextInt();

        scanner.close(); 

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        }

       else if (num2 > num1 && num2 > num3){
            System.out.println( num2);
        }

       else if (num3 > num1 && num3 > num2){
            System.out.println(num3);
        }
    }
}

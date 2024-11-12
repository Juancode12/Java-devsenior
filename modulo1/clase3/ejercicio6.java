import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Introducir un número porfavor");
        int num1 = num.nextInt();
        num.close();

        if (num1 % 2 == 0 && num1 % 7 ==0){
            System.out.println("el numero es divisible por 2 y 7");
        }

        else{
            System.err.println("el num no es divisible capo");
        }
    }
}

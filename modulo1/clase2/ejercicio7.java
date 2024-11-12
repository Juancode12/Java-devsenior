import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor introducir los numeros a operar");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        scanner.close();
        System.out.println("Suma : " + (num1+num2));
        System.out.println("Resta : " + (num1-num2));
        System.out.println("Multiplicación : " + (num1*num2));
        System.out.println("División  : " + (num1/num2));

    }
}

import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner cantidad = new Scanner(System.in);
        System.out.println("Porfavor introduzca una cantidad");
        int num = cantidad.nextInt();
        cantidad.close();

        if (num <= 50){
            System.out.println("$50.000");
        }

        else if (num >= 50 && num <= 100){
            System.out.println("$45.000");
        }

        else if (num >= 100 && num <= 150){
            System.out.println("$40.000");
        }

        else if (num >= 150 && num <= 200){
            System.out.println("$35.000");
        }

       

       else {
        System.err.println("$25.000");
       }
    }
}
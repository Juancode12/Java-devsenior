import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner edad = new Scanner(System.in);
        System.out.println("Porfavor introduzca una edad");
        int num = edad.nextInt();
        edad.close();

        if (num < 5){
            System.out.println("Primera infancia");
        }

        else if (num > 5 && num < 11){
            System.out.println("Primera infancia");
        }

        else if (num >= 5 && num <= 11){
            System.out.println("Primera infancia");
        }

        else if (num >= 11 && num <= 18){
            System.out.println("adolescencia");
        }

        else if (num >= 19 && num <= 26){
            System.out.println("Juventud");
        }

        else if (num >=27 &&  num >= 59){
            System.out.println("Adultez");
       }

       else {
        System.err.println("Persona mayor");
       }
    }
}

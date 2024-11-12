import  java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner caracter = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = caracter.next().charAt(0);
        caracter.close();
        

        if (Character.isUpperCase(letra)){
            System.out.println("Es mayúscula");

        }

        
        else if (Character.isLowerCase(letra)){
            System.out.println("Es minúscula");

        }

        else {
            System.out.println("no es una letra válida");
        }
    }
}    
        


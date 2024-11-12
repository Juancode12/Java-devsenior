import java.util.Scanner;
public class ejercicio12 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digitar peso de la sandia");
            int peso = input.nextInt();
            String resultado = verificacion(peso);
            System.out.println(resultado);
        }
        
    }

    public static String verificacion(int a){
        if (a % 2 == 0){
            return "Sí";

        }

        else{
            return "No";
        }

    }
}
import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner caracter = new Scanner(System.in);
        System.out.println("introducir letra");
        char letra = caracter.next().charAt(0);
        caracter.close();

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'  || letra == 'u'){

        }
    

        else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O'  || letra == 'U'){
            System.out.println("es vocal");

        }

        else{
            System.out.println("es una consonante");
        }
    }
}
import java.util.Scanner;

public class ejercicio02polindromos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa una cadena de texto:");
        String texto = scanner.nextLine();
        
        if (esPalindromo(texto)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
        
        scanner.close();
    }

    public static boolean esPalindromo(String texto) {
        
        String textoNormalizado = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();

        
        String reverso = new StringBuilder(textoNormalizado).reverse().toString();

        
        return textoNormalizado.equals(reverso);
    }
}

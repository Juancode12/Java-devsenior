import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto:");
        String texto = scanner.nextLine();
        scanner.close();
        
        
        String[] palabras = texto.split("\\W+"); 
        
        
        Map<String, Integer> contadorDePalabras = new HashMap<>();
        
        
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase(); 
            if (contadorDePalabras.containsKey(palabra)) {
                contadorDePalabras.put(palabra, contadorDePalabras.get(palabra) + 1);
            } else {
                contadorDePalabras.put(palabra, 1);
            }
        }
        
       
        System.out.println("Frecuencia de las palabras:");
        for (Map.Entry<String, Integer> entrada : contadorDePalabras.entrySet()) {
            System.out.printf("%s: %d%n", entrada.getKey(), entrada.getValue());
        }
    }
}

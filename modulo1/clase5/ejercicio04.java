import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
 

public class ejercicio04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> mail = new HashSet<>();
        while (true) {
        System.out.println("Nombre del correo Eléctronico, digitar salir para cerrar el programa");
        String email = scanner.nextLine();

        if (email.equalsIgnoreCase("salir")) { 
            break;  
        }
        String resultado = verificadorDeCorreos(mail, email);
        System.out.println(resultado);
        
        }
        scanner.close();
        System.out.println("Lista final de correos");
        for (String i : mail){
            System.out.println(i);
        }
        
    }

    public static String verificadorDeCorreos(Set<String>mail, String email) {
        if (mail.contains(email)){
           return String.format("El correo %s está duplicado: ",  email);
      
        }

        else{
            mail.add(email);
            return String.format("El correo ha sido agregado exitosamente: " +  email);
        }
    }
}
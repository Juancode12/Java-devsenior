import java.util.Scanner;

public class PedirPalabras {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);

      
        System.out.println("Introducir primera palabra: ");
        String PrimeraPalabra = entrada.nextLine();

       
        System.out.println("Introduce segunda palabra: ");
        String SegundaPalabra = entrada.nextLine();

        System.out.println("Introduce tercera palabra: ");
        String TerceraPalabra = entrada.nextLine();

        

        System.out.println(PrimeraPalabra + " " + SegundaPalabra + " " + TerceraPalabra);
        entrada.close();
    }
}

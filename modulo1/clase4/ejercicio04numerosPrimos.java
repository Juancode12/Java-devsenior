import java.util.Scanner;
public class ejercicio04numerosPrimos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("porfavor ingresar un número positivo");
        int numeroPrimo = scanner.nextInt();
        
        if (numeroPrimo > 0) {
            String resultado = obtenerNumeroPrimo(numeroPrimo);
            System.out.print(resultado + " ");
        }

        else if (numeroPrimo < 0){
             System.out.println("no se permiten numeros negativos");
        }

        else {
            System.out.println("parametro no valido");
        }
        scanner.close();
    }

    public static String obtenerNumeroPrimo(int a){
        if (a == 2){
            return "Es un numero primo";
        }

        else if (a % 2 != 0){
            return "es primo";
        }

        else {
            return "No es primo";
        }
    }
}

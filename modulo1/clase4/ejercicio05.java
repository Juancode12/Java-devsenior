import java.util.Scanner;
public class ejercicio05 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("ingresar el 1 numero: "); 
     double num1 = scanner.nextDouble();   
     System.out.print("ingresar el 2 numero: ");  
     double num2 = scanner.nextDouble(); 
     System.out.print("ingresar el 3 numero: ");  
     double num3 = scanner.nextDouble(); 
     
     scanner.close();
     double resultado = media(num1, num2, num3);
     System.out.println("el promedio de los tres numeros es " + resultado );

    }

    public static double media(double a, double b, double c){
        return (a + b + c) / 3;
    }
}

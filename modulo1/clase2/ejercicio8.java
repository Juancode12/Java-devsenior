import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insertar el lado para calcular el area");
        double area = scanner.nextDouble();
        scanner.close();

        Double resultadoArea = obtenerArea(area);
        System.out.println("el Area es " + resultadoArea);

        Double resultadoPerimetro = obtenerPerimetro(area);
        System.out.println("el Perimetro es " + resultadoPerimetro);
    }

    public static double obtenerArea(double a){
      return Math.pow(a, 2);
    }

    public static double obtenerPerimetro(double a){
        return Math.pow(a, 4);
      }
}

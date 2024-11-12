import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("introducir el 1 valor del triángulo");
        double triangle1 = triangle.nextDouble();

        System.out.println("introducir el 2 valor del triángulo");
        double triangle2 = triangle.nextDouble();

        System.out.println("introducir el 3 valor del triángulo");
        double triangle3 = triangle.nextDouble();

        triangle.close();

        if (triangle1 > 0 && triangle2 > 0 && triangle3 > 0){
            System.out.println("si se puede formar un triangulo con estos números");
        }

        else {
            System.out.println("no se puede formar un triangulo con estos numeros");
        }
    }
}

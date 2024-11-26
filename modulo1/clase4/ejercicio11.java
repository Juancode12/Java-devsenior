import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a calculadora IMC. Recuerda que todas las medidas deben ser en kg y metros.");
        System.out.print("Ingresar altura en metros para calcular tu IMC: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingresar peso en kg: ");
        double peso = scanner.nextDouble();
        
        double resultado = imcCalculator(altura, peso);
        System.out.println("Tu imc es " + resultado);
        String imc = imcCategoria(resultado);
        System.out.println("Tu categoría de IMC es: " + imc);
        
        scanner.close();
    }

    public static double imcCalculator(double altura, double peso){
        return peso / Math.pow(altura, 2);
    }

    public static String imcCategoria(double imc){
        if (imc < 18.5){
            return "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9){
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9){
            return "Obesidad grado I";
        } else if (imc >= 35 && imc <= 39.9){
            return "Obesidad grado II";
        } else if (imc >= 40){
            return "Obesidad grado III";
        } else {
            return "Algo ha salido mal";
        }
    }
}

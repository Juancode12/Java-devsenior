import java.util.Scanner;
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introducir el tamaño del array: ");
        int arraySize = scanner.nextInt();
        int[] arreglo = new int[arraySize];
        for (int i = 0; i < arreglo.length; i++){
            System.out.printf("Introducir el valor del arreglo N: %d%n", i + 1);
            arreglo[i] = scanner.nextInt();
        }
        
        int resultado = suma(arreglo);
        System.out.printf("El resultado de la suma del array es: %d%n", resultado);
        
        int maxValor = valorMax(arreglo);
        System.out.printf("El valor máximo del array es: %d%n", maxValor);

        int minValor = valorMin(arreglo);
        System.out.printf("El valor mínimo del array es: %d%n", minValor);

        int[] invertido = arrayInvertido(arreglo);
        System.out.print("El array invertido es: ");
        for (int i : invertido) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        
        System.out.println();

        double promedio = promedioArray(arreglo);
        System.out.printf("El promedio del array es %.2f%n", promedio);

        int moda = obtenerModa(arreglo);
        System.out.printf("La moda del array es %d%n", moda);

        scanner.close(); 
    }

    public static int suma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }
    
    public static int valorMax(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int valorMin(int[] array) {
        int min = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] arrayInvertido(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

    

    public static double promedioArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return (double) suma / array.length;
    }

    public static int obtenerModa(int[] array) {
        int moda = array[0];
        int maxCount = 0;
        
        for (int i = 0; i < array.length; ++i) {
            int count = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i]) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = array[i];
            }
        }
        return moda;
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        int precioPagado = 34;
        double descuento = 0.15;
        double precioOriginal = precioPagado / (1 - descuento);

        System.out.printf("El precio original de los pantalones era: %.2f€%n", precioOriginal);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class ejercicio01 {
    public static void main(String[] args) {
        List<String> ventas = Arrays.asList(
       "camisa,2,20.00",
            "pantalon,1,35.50",
            "zapatos,3,50.00",
            "camisa,1,20.00",
            "pantalon,2,35.50"
        );

       
        double ingresoTotal = ventas.stream()
            .mapToDouble(venta -> {
                String[] datos = venta.split(",");
                return Integer.parseInt(datos[1]) * Double.parseDouble(datos[2]);
            })
            .sum();
        System.out.println("Ingreso Total: $" + ingresoTotal);

       
        Map<String, Long> contadorProductos = ventas.stream()
            .map(venta -> venta.split(",")[0])
            .collect(Collectors.groupingBy(producto -> producto, Collectors.counting()));
        System.out.println("Contador de Ventas por Producto: " + contadorProductos);

       
        double montoEspecifico = 60.00;
        List<String> ventasFiltradas = ventas.stream()
            .filter(venta -> {
                String[] datos = venta.split(",");
                double totalVenta = Integer.parseInt(datos[1]) * Double.parseDouble(datos[2]);
                return totalVenta > montoEspecifico;
            })
            .collect(Collectors.toList());
        System.out.println("Ventas Mayores a $" + montoEspecifico + ": " + ventasFiltradas);

       
        Map<String, Integer> cantidadProductos = ventas.stream()
            .collect(Collectors.groupingBy(
                venta -> venta.split(",")[0],
                Collectors.summingInt(venta -> Integer.parseInt(venta.split(",")[1]))
            ));
        String productoMasVendido = Collections.max(cantidadProductos.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Producto Más Vendido: " + productoMasVendido);
    }
}

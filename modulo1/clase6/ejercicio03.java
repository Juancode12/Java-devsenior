import java.util.*;
import java.util.stream.Collectors;

public class ejercicio03 {

    public static void main(String[] args) {
        List<String> facturas = Arrays.asList(
            "F001,ClienteA,1000.00,19",
            "F002,ClienteB,1500.00,19",
            "F003,ClienteA,2000.00,19",
            "F004,ClienteC,2500.00,19",
            "F005,ClienteB,3000.00,19"
        );

        List<String> facturasConIva = facturas.stream()
            .map(factura -> {
                String[] datos = factura.split(",");
                double montoTotal = Double.parseDouble(datos[2]);
                double iva = Double.parseDouble(datos[3]);
                double montoConIva = montoTotal + (montoTotal * iva / 100);
                return datos[0] + "," + datos[1] + "," + montoConIva + "," + iva;
            })
            .collect(Collectors.toList());
        System.out.println("Facturas con IVA: " + facturasConIva);

      
        Map<String, Double> ingresoPorCliente = facturas.stream()
            .collect(Collectors.groupingBy(
                factura -> factura.split(",")[1],
                Collectors.summingDouble(factura -> Double.parseDouble(factura.split(",")[2]))
            ));
        System.out.println("Ingreso Total por Cliente: " + ingresoPorCliente);

    
        double valorEspecifico = 1800.00;
        List<String> facturasFiltradas = facturas.stream()
            .filter(factura -> Double.parseDouble(factura.split(",")[2]) > valorEspecifico)
            .collect(Collectors.toList());
        System.out.println("Facturas mayores a " + valorEspecifico + ": " + facturasFiltradas);

   
        String clienteMayorIngreso = ingresoPorCliente.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();
        System.out.println("Cliente con el Mayor Ingreso Total: " + clienteMayorIngreso);
    }
}

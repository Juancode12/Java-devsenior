import java.util.*;
import java.util.stream.Collectors;

public class ejercicio05 {

    public static void main(String[] args) {
        List<String> productos = Arrays.asList(
            "TabletX,LoteA,8",
            "SmartphoneY,LoteB,7",
            "SmartwatchZ,LoteC,6",
            "LaptopW,LoteD,9",
            "TabletX,LoteE,8"
        );

        List<String> inspecciones = Arrays.asList(
            "LoteA,funcionalidad,85",
            "LoteB,seguridad,92",
            "LoteC,funcionalidad,75",
            "LoteD,seguridad,60",
            "LoteA,seguridad,88",
            "LoteC,seguridad,82",
            "LoteB,funcionalidad,80"
        );

        List<String> fallos = Arrays.asList(
            "LoteA,sobrecalentamiento,3",
            "LoteB,pantalla,5",
            "LoteC,batería,2",
            "LoteD,sobrecalentamiento,7",
            "LoteA,pantalla,2"
        );

      
        Map<String, Double> indiceAprobacionPorLote = inspecciones.stream()
            .collect(Collectors.groupingBy(
                inspeccion -> inspeccion.split(",")[0],
                Collectors.averagingDouble(inspeccion -> Double.parseDouble(inspeccion.split(",")[2]))
            ));

        System.out.println("Índice de Aprobación por Lote: " + indiceAprobacionPorLote);

      
        List<String> lotesRequierenAtencion = indiceAprobacionPorLote.entrySet().stream()
            .filter(entry -> entry.getValue() < 80)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        System.out.println("Lotes con Índice de Aprobación inferior al 80%: " + lotesRequierenAtencion);

     
        Map<String, Integer> complejidadPorLote = productos.stream()
            .collect(Collectors.toMap(
                producto -> producto.split(",")[1],
                producto -> Integer.parseInt(producto.split(",")[2])
            ));

        List<String> lotesAltoRiesgo = indiceAprobacionPorLote.entrySet().stream()
            .filter(entry -> complejidadPorLote.get(entry.getKey()) > 7 && entry.getValue() < 85)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        System.out.println("Lotes con Complejidad Alta y Baja Aprobación: " + lotesAltoRiesgo);

   
        Map<String, Long> frecuenciaFallos = fallos.stream()
            .collect(Collectors.groupingBy(
                fallo -> fallo.split(",")[1],
                Collectors.counting()
            ));

        System.out.println("Frecuencia de Tipos de Fallos: " + frecuenciaFallos);

        List<String> fallosFrecuentes = frecuenciaFallos.entrySet().stream()
            .filter(entry -> entry.getValue() >= 3)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        System.out.println("Tipos de Fallos Frecuentes (al menos en 3 lotes): " + fallosFrecuentes);
      
        Map<String, Integer> totalFallosPorLote = fallos.stream()
            .collect(Collectors.groupingBy(
                fallo -> fallo.split(",")[0],
                Collectors.summingInt(fallo -> Integer.parseInt(fallo.split(",")[2]))
            ));

        String loteMayorIncidencia = totalFallosPorLote.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();

        System.out.println("Lote con Mayor Incidencia de Fallos: " + loteMayorIncidencia);

       
        String productoMayorIncidencia = productos.stream()
            .filter(producto -> producto.contains(loteMayorIncidencia))
            .map(producto -> producto.split(",")[0])
            .findFirst()
            .get();

        Map<String, Long> fallosLoteMayor = fallos.stream()
            .filter(fallo -> fallo.contains(loteMayorIncidencia))
            .collect(Collectors.groupingBy(
                fallo -> fallo.split(",")[1],
                Collectors.counting()
            ));

        String falloMasFrecuente = fallosLoteMayor.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();

        System.out.println("Producto del lote con mayor incidencia: " + productoMayorIncidencia);
        System.out.println("Tipo de fallo más frecuente: " + falloMasFrecuente);

        // 5. Evaluar la Calidad Promedio por Tipo de Inspección
        Map<String, Double> calidadPromedioPorInspeccion = inspecciones.stream()
            .collect(Collectors.groupingBy(
                inspeccion -> inspeccion.split(",")[1],
                Collectors.averagingDouble(inspeccion -> Double.parseDouble(inspeccion.split(",")[2]))
            ));

        System.out.println("Calidad Promedio por Tipo de Inspección: " + calidadPromedioPorInspeccion);

        String inspeccionConMenorAprobacion = calidadPromedioPorInspeccion.entrySet().stream()
            .min(Map.Entry.comparingByValue())
            .get()
            .getKey();

        System.out.println("Tipo de Inspección con la aprobación promedio más baja: " + inspeccionConMenorAprobacion);

      
        List<String> lotesCriticos = inspecciones.stream()
            .filter(inspeccion -> inspeccion.split(",")[1].equals("seguridad") && Double.parseDouble(inspeccion.split(",")[2]) < 75)
            .map(inspeccion -> inspeccion.split(",")[0])
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Lotes con Fallos Críticos en Inspecciones Clave: " + lotesCriticos);

     
        Map<String, Double> indiceAprobacionMejorado = indiceAprobacionPorLote.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> {
                    String lote = entry.getKey();
                    if (complejidadPorLote.get(lote) > 7) {
                        return Math.min(entry.getValue() + 5, 100); // Aumenta un 5% con límite en 100%
                    }
                    return entry.getValue();
                }
            ));

        System.out.println("Índice de Aprobación Mejorado: " + indiceAprobacionMejorado);
    }
}

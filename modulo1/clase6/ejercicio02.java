import java.util.*;
import java.util.stream.Collectors;

public class ejercicio02 {

    public static void main(String[] args) {
        List<String> calificaciones = Arrays.asList(
            "Juan,Matematicas,85",
            "Ana,Historia,90",
            "Pedro,Matematicas,70",
            "Juan,Historia,75",
            "Ana,Matematicas,95",
            "Pedro,Historia,80"
        );

      
        Map<String, Double> promedioPorEstudiante = calificaciones.stream()
            .collect(Collectors.groupingBy(
                calificacion -> calificacion.split(",")[0],
                Collectors.averagingDouble(calificacion -> Double.parseDouble(calificacion.split(",")[2]))
            ));
        System.out.println("Promedio de calificaciones por estudiante: " + promedioPorEstudiante);

      
        Map<String, Long> estudiantesPorMateria = calificaciones.stream()
            .collect(Collectors.groupingBy(
                calificacion -> calificacion.split(",")[1],
                Collectors.counting()
            ));
        System.out.println("Conteo de estudiantes por materia: " + estudiantesPorMateria);

    
        double valorEspecifico = 80.00;
        List<String> calificacionesMayores = calificaciones.stream()
            .filter(calificacion -> Double.parseDouble(calificacion.split(",")[2]) > valorEspecifico)
            .collect(Collectors.toList());
        System.out.println("Calificaciones mayores a " + valorEspecifico + ": " + calificacionesMayores);

       
        Map<String, Double> promedioPorMateria = calificaciones.stream()
            .collect(Collectors.groupingBy(
                calificacion -> calificacion.split(",")[1],
                Collectors.averagingDouble(calificacion -> Double.parseDouble(calificacion.split(",")[2]))
            ));
        String materiaConPromedioMasAlto = promedioPorMateria.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();
        System.out.println("Materia con el promedio más alto: " + materiaConPromedioMasAlto);
    }
}

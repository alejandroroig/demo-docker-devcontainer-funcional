import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class MainFuncional {

    public static void main(String[] args) throws IOException {
        Path fichero = Path.of("data", "alumnos.csv");

        double media;

        try (Stream<String> lineas = Files.lines(fichero)) {
            media = lineas
                    .skip(1) // Ignoramos la cabecera del CSV.
                    .map(Alumno::desdeCsv)
                    .filter(alumno -> alumno.getNota() >= 5)
                    .mapToDouble(Alumno::getNota)
                    .average()
                    .orElse(0);
        }

        System.out.printf("Media de los aprobados: %.2f%n", media);
    }
}

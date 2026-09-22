import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainImperativo {

    public static void main(String[] args) throws IOException {
        Path fichero = Path.of("data", "alumnos.csv");
        double suma = 0;
        int cantidad = 0;

        try (BufferedReader reader = Files.newBufferedReader(fichero)) {
            reader.readLine(); // Ignoramos la cabecera del CSV.

            String linea;
            while ((linea = reader.readLine()) != null) {
                Alumno alumno = Alumno.desdeCsv(linea);

                if (alumno.getNota() >= 5) {
                    suma += alumno.getNota();
                    cantidad++;
                }
            }
        }

        double media = cantidad > 0 ? suma / cantidad : 0;

        System.out.printf("Media de los aprobados: %.2f%n", media);
    }
}

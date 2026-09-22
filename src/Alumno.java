public class Alumno {
    private final String nombre;
    private final String ciclo;
    private final double nota;

    public Alumno(String nombre, String ciclo, double nota) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.nota = nota;
    }

    public static Alumno desdeCsv(String linea) {
        String[] campos = linea.split(",");

        return new Alumno(
                campos[0].trim(),
                campos[1].trim(),
                Double.parseDouble(campos[2].trim()));
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombre + " (" + ciclo + "): " + nota;
    }
}

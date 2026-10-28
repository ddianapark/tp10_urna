public class Participante extends ElementoSorteable {
    private String nombre;
    private String dni;

    public Participante(String idSorteable, String nombre, String dni) {
        super(idSorteable);
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String obtenerRepresentacion() {
        return "Participante [ID: " + idSorteable + "] - " + nombre + " (DNI: " + dni + ")";
    }
}
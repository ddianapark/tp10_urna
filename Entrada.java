public class Entrada extends ElementoSorteable {
    private int numeroAsiento;
    private String sector;

    public Entrada(String idSorteable, int numeroAsiento, String sector) {
        super(idSorteable);
        this.numeroAsiento = numeroAsiento;
        this.sector = sector;
    }

    @Override
    public String obtenerRepresentacion() {
        return "Entrada [ID: " + idSorteable + "] - Sector: " + sector + " | Asiento: " + numeroAsiento;
    }
}
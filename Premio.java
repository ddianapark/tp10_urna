public class Premio extends ElementoSorteable {
    private String descripcion;
    private double valorMonetario;

    public Premio(String id, String descripcion, double valor) {
        super(id);
        this.descripcion = descripcion;
        this.valorMonetario = valor;
    }

    @Override
    public String obtenerRepresentacion() {
        return "Premio [ID: " + idSorteable + "] - " + descripcion + " ($" + valorMonetario + ")";
    }
}
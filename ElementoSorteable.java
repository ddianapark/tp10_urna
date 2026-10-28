public abstract class ElementoSorteable {
    protected String idSorteable;

    public ElementoSorteable(String idSorteable) {
        this.idSorteable = idSorteable;
    }

    public abstract String obtenerRepresentacion();
}
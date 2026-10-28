public class Main {
    public static void main(String[] args) {
        Urna<ElementoSorteable> urna = new Urna<>();
        
        Participante p1 = new Participante("P01", "Lucía", "40111222");
        Premio pr1 = new Premio("PR01", "Voucher de Compra", 25000.0);
        Entrada e1 = new Entrada("E01", 14, "Platea Baja");

        urna.agregar(p1);
        urna.agregar(pr1);
        urna.agregar(e1);

        System.out.println("Cantidad inicial en la urna: " + urna.consultarCantidad());
        System.out.println("-------------------------------------------------");

        while (!urna.estaVacia()) {
            ElementoSorteable extraido = urna.extraer();
            System.out.println("¡Sorteado!: " + extraido.obtenerRepresentacion());
            System.out.println("Cantidad restante: " + urna.consultarCantidad());
        }

        System.out.println("-------------------------------------------------");
        try {
            urna.extraer();
        } catch (IllegalStateException e) {
            System.out.println("Prueba de urna vacía exitosa: " + e.getMessage());
        }
    }
}
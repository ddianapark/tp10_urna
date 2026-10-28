import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Urna<T> {
    private List<T> elementos;
    private Random random;

    public Urna() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    public void agregar(T elemento) {
        this.elementos.add(elemento);
    }

    public T extraer() {
        if (estaVacia()) {
            throw new IllegalStateException("Error: La urna está vacía.");
        }
        int indiceAleatorio = random.nextInt(elementos.size());
        return elementos.remove(indiceAleatorio);
    }

    public int consultarCantidad() {
        return this.elementos.size();
    }

    public boolean estaVacia() {
        return this.elementos.isEmpty();
    }
}
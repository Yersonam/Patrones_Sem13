import java.util.Iterator;
import java.util.List;

// Interfaz para el iterador
interface Iterador<T> {
    boolean tieneSiguiente();
    T siguiente();
}

// Clase para la implementación del iterador
class MiIterador<T> implements Iterator<T>, Iterador<T> {
    private List<T> elementos;
    private int indice;

    public MiIterador(List<T> elementos) {
        this.elementos = elementos;
        this.indice = 0;
    }

    // Implementación de los métodos de la interfaz Iterator
    @Override
    public boolean hasNext() {
        return indice < elementos.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T elemento = elementos.get(indice);
            indice++;
            return elemento;
        }
        return null;
    }

    // Implementación de los métodos de la interfaz Iterador
    @Override
    public boolean tieneSiguiente() {
        return hasNext();
    }

    @Override
    public T siguiente() {
        return next();
    }
}

// Clase para la colección
class MiColeccion<T> implements Iterable<T> {
    private List<T> elementos;

    public MiColeccion(List<T> elementos) {
        this.elementos = elementos;
    }

    // Implementación de la interfaz Iterable
    @Override
    public Iterator<T> iterator() {
        return new MiIterador<T>(elementos);
    }
}



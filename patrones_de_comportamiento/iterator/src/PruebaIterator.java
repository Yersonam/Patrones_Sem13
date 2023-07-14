import java.util.List;

public class PruebaIterator {
    public static void main(String[] args) {
        List<String> elementos = List.of("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4");

        // Iteración con un bucle for-each
        for (String elemento : elementos) {
            System.out.println(elemento);
        }

        // Iteración con un Iterador
        Iterador<String> iterador = new MiIterador<String>(elementos);
        while (iterador.tieneSiguiente()) {
            String elemento = iterador.siguiente();
            System.out.println(elemento);
        }
    }
}

// Clase concreta para los creadores de cartas
public class CreadorCarta extends CreadorDocumento {
    // Sobrescribe el método abstracto para devolver una carta
    public Documento crearDocumento() {

        return new Carta();
    }
}

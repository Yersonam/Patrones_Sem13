// Clase concreta para los creadores de informes
public class CreadorInforme extends CreadorDocumento {
    // Sobrescribe el método abstracto para devolver un informe
    public Documento crearDocumento() {
        return new Informe();
    }
}

// Clase abstracta para los creadores de documentos
public abstract class CreadorDocumento {
    // Método abstracto para crear documentos
    public abstract Documento crearDocumento();
    // Método para usar los documentos
    public void usarDocumento() {
        // Invoca al método abstracto para crear el documento
        Documento doc = crearDocumento();
        // Usa el documento creado
        doc.imprimir();
    }
}

// Clase concreta para los creadores de facturas
public class CreadorFactura extends CreadorDocumento {
    // Sobrescribe el método abstracto para devolver una factura
    public Documento crearDocumento() {
        return new Factura();
    }
}

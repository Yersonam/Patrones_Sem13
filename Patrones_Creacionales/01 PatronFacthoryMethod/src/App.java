// Ejemplo de uso


public class App {
    public static void main(String[] args) {
        // Crea un creador de informes
        CreadorDocumento creador = new CreadorInforme();
        // Usa el creador de informes para crear y usar un informe
        creador.usarDocumento();

        // Crea un creador de facturas
        creador = new CreadorFactura();
        // Usa el creador de facturas para crear y usar una factura
        creador.usarDocumento();

        // Crea un creador de cartas
        creador = new CreadorCarta();
        // Usa el creador de cartas para crear y usar una carta
        creador.usarDocumento();
    }
}
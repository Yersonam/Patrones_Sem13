// Uso del código
public class Main {
    public static void main(String[] args) {
        // Crear un auto de media calidad
        AbstractFactory mediaCalidadFactory = new MediaCalidadFactory();
        Auto autoMediaCalidad = new Auto(mediaCalidadFactory);
        autoMediaCalidad.mostrarDescripcion();
    }
}
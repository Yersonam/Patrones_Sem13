public class Singleton {
    private static Singleton instance;
    private String data;
    private Singleton() {// Constructor privado para evitar la creación de instancias desde fuera de la clase
        data = "Datos de ejemplo";}
    public static Singleton getInstance() {
        // Método estático para obtener la instancia única
        if (instance == null) {
            instance = new Singleton();}
        return instance;}
    public void imprimir(){System.out.print("Datos prueba");}
    public String getData() {
        return data;
    }
}

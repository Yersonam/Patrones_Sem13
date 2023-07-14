package Cliente;

public class cliente {
    private static cliente instancia;
    private String nombre;

    private cliente (String nombre) {
        this.nombre = nombre;
    }

    public static cliente obtenerInstancia (String nombre) {
        if (instancia == null) {
            instancia = new cliente(nombre);
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }






}

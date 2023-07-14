package ejem_Proxy;

public class Cliente {
    private servicio seRvicio;

    public Cliente(servicio seRvicio) {
        this.seRvicio = seRvicio;
    }

    public void ejecutarServicio() {
        seRvicio.realizarOperacion();
    }
}

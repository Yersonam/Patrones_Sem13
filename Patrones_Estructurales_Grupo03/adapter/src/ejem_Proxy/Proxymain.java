package ejem_Proxy;

public class Proxymain {
    public static void main(String[] args) {
        servicio seRvicio = new ServicioProxy();
        Cliente cliente = new Cliente(seRvicio);
        cliente.ejecutarServicio();
    }
}

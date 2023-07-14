package ejem_Proxy;

public class ServicioReal implements servicio{
    @Override
    public void realizarOperacion() {
        System.out.println("Realizando operación...");
    }
}

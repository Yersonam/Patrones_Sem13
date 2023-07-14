package Template_Method.src;

public class DigitalDescarga extends  OrdenProcesar{

    @Override
    protected void validarOrden() {
        System.out.println("Validando el pedido de descarga digital...");
    }

    @Override
    protected void prepararOrden() {
        System.out.println("Preparando el pedido de descarga digital...");
    }

    @Override
    protected void pasosAdicionales() {
        System.out.println("Generando el enlace de descarga...");
    }
}

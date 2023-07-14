package Template_Method.src;

public abstract class OrdenProcesar {

    public void OrdenProcesar() {
        validarOrden();

        // Paso común para todos los tipos de pedidos
        prepararOrden();;

        // Paso específico para cada tipo de pedido
        pasosAdicionales();

        shipOrder();
    }

    protected abstract void validarOrden();
    protected abstract void prepararOrden();
    protected abstract void pasosAdicionales();

    protected void shipOrder() {
        System.out.println("El pedido ha sido enviado.");
    }

}

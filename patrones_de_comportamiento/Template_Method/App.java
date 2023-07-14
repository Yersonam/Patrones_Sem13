package Template_Method;
import java.lang.System;
import Template_Method.src.*;

public class App {
    public static void main(String[] args) {
    OrdenProcesar physicalProductOrder = new ProductoFisico();
        System.out.println("******************************************************************************+");
        physicalProductOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");

    OrdenProcesar digitalDownloadOrder = new DigitalDescarga();
        digitalDownloadOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");

    OrdenProcesar  subscriptionOrder = new Suscripcion();
        subscriptionOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");
}


}

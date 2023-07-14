package Ejemplo_01;
public class RealPayment implements Payment {
    private double monto_de_pago;
    public RealPayment(double monto_de_pago) {
        this.monto_de_pago = monto_de_pago;
    }
    @Override
    public void pay() {
        System.out.println("RealPayment: Realizando el pago de "+monto_de_pago+" dólares. ");
    }
}

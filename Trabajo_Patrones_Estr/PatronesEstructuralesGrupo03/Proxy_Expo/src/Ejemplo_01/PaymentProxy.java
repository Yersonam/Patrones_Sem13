package Ejemplo_01;
public class PaymentProxy implements Payment {
    private RealPayment realPayment;
    private double monto_de_pago;
    public PaymentProxy(double monto_de_pago) {
        this.monto_de_pago = monto_de_pago;
    }
    @Override
    public void pay() { // método principal que controla la realización del pago.
        if(realPayment==null){   // Asegurar solo una instancia de RealPayment
            realPayment=new RealPayment(monto_de_pago);
        }
        if(verifySALDO_DISPONIBLE()){ // Verificar si el saldo disponible es suficiente para realizar el pago
            confirmPayment(); // Método simula una solicitud de confirmación al usuario antes de realizar el pago
            realPayment.pay();
            System.out.println("PaymentProxy: Pago realizado exitosamente. ");
        } else {
            System.out.println("PaymentProxy: Saldo insuficiente. No se pudo realizar el pago. ");
        }
    }
    private boolean verifySALDO_DISPONIBLE(){
        double saldo_disponible=500.0; //Simulación del saldo disponible
        return monto_de_pago<= saldo_disponible; // se considera que el saldo es suficiente y devuelve true
    }
    private void confirmPayment(){ // Método simula una solicitud de confirmación al usuario antes de realizar el pago
        System.out.println("PaymentProxy: Confirmar el pago de "+monto_de_pago+" dólares. ");
    }
}

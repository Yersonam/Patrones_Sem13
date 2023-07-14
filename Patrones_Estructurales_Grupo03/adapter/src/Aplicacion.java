public class Aplicacion {
    public static void main(String[] args) {
        Aplicacion miAplicacion = new Aplicacion();
        System.out.println("\n******************Motor Comun*********************");
        miAplicacion.usarMotorComun();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Economico******************");
        miAplicacion.usarMotorEconomico();
        System.out.println("**************************************************\n");
        System.out.println("*****************Motor Electrico******************");
        miAplicacion.usarMotorElectrico();
        System.out.println("**************************************************\n");

    }
    private void usarMotorComun() {
        Motor motor = new MotorEconomico();
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private void usarMotorElectrico() {
        Motor motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private void usarMotorEconomico() {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}

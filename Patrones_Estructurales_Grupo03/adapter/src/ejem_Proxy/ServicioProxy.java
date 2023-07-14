package ejem_Proxy;

public class ServicioProxy implements servicio {
    private ServicioReal servicioReal;

    @Override
    public void realizarOperacion() {
        if (servicioReal == null) {
            servicioReal = new ServicioReal();
        }

        preOperacion();

        // Lógica adicional del proxy antes de llamar al objeto real
        servicioReal.realizarOperacion();

        postOperacion();
    }

    private void preOperacion() {
        System.out.println("Realizando tareas previas a la operación...");
    }

    private void postOperacion() {
        System.out.println("Realizando tareas posteriores a la operación...");
    }
}

package Chain_Responsability.src;

public abstract class AprobadorBase implements Aprobador {
    private Aprobador siguiente;

    @Override
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarSolicitud(Solicitud solicitud) {
        if (puedeAprobar(solicitud)) {
            System.out.println("La solicitud fue aprobada por " + getNombre());
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(solicitud);
        } else {
            System.out.println("Ningún aprobador pudo procesar la solicitud.");
        }
    }

    protected abstract boolean puedeAprobar(Solicitud solicitud);

    protected abstract String getNombre();
}
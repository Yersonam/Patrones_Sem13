package Chain_Responsability.src;

public interface Aprobador {
    void setSiguiente(Aprobador siguiente);
    void procesarSolicitud(Solicitud solicitud);

}

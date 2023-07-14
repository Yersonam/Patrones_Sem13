package Chain_Responsability.src;

public class AprobadorSenior extends AprobadorBase {
    @Override
    protected boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= 5000;
    }

    @Override
    protected String getNombre() {
        return "Aprobador Senior";
    }
}
package Chain_Responsability.src;

public class AprobadorJunior extends AprobadorBase{

    @Override
    protected boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= 1000;
    }

    @Override
    protected String getNombre() {
        return "Aprobador Junior";
    }
}

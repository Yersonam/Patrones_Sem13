package Observer;

public class SolPE extends Observador{

    private double valorCambio = 3.67;
    private String name="Nuevo Sol";
    public SolPE(Subject sujeto) {
        this.sujeto = sujeto;
    }

    @Override
    public double actualizar() {
        return sujeto.getEstado() * valorCambio;
    }

    @Override
    public String moneda(){
        return  name;
    }

}

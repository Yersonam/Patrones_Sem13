package Observer;

public class RealBRA extends Observador{


    private double valorCambio = 5.05;
    private String name="Real";
    public RealBRA(Subject sujeto) {
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

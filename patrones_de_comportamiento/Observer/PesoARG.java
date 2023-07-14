package Observer;

public class PesoARG extends Observador{

    private double valorCambio = 239.46;
    private String name="Peso Argentino";
    public PesoARG(Subject sujeto) {
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

package Observer;

public class PesoMX extends Observador{

    private double valorCambio = 17.68;
    private String name="Peso Mexicano";
    public PesoMX(Subject sujeto) {
        this.sujeto = sujeto;

    }

    @Override
    public double actualizar()
    {
        return sujeto.getEstado() * valorCambio;
    }
    @Override
    public String moneda(){
        return  name;
    }


}

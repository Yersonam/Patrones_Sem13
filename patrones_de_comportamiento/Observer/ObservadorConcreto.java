package Observer;

public class ObservadorConcreto extends Observador{

    private double valorCambio ;
    private String name;
    public ObservadorConcreto(String name,Subject sujeto,double valorCambio) {
        this.name=name;
        this.sujeto = sujeto;
        this.valorCambio=valorCambio;

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

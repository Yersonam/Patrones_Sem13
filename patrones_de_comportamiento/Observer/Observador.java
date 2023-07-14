package Observer;

public abstract class Observador {

    protected String name;
    protected Subject sujeto;


    public abstract double actualizar();
    public abstract String moneda();



}

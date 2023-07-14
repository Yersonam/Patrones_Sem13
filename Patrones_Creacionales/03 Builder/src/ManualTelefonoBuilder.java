public class ManualTelefonoBuilder implements Builder {
    private String marca;
    private String modelo;
    private String capacidad;
    private double tamanioPantalla;

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    @Override
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;

    }

    @Override
    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;

    }

    public Manual getResultado() {
        return new Manual(marca, modelo, capacidad, tamanioPantalla);
    }

}

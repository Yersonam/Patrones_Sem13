public class TelefonoMovil {
    private final String marca;
    private final String modelo;
    private final String capacidad;
    private final double tamanioPantalla;

    public TelefonoMovil(String marca, String modelo, String capacidad, double tamanioPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }
}

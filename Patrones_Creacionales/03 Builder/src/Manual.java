public class Manual {
    private final String marca;
    private final String modelo;
    private final String capacidad;
    private final double tamanioPantalla;


    public Manual(String marca, String modelo, String capacidad, double tamanioPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.tamanioPantalla = tamanioPantalla;
    }

    public String imprimirManual() {
        StringBuilder sb = new StringBuilder("Marca: " + marca + "\n");
        sb.append("Modelo: " + modelo + "\n");
        sb.append("Capacidad: " + capacidad + "\n");
        sb.append("Tamaño de pantalla: " + tamanioPantalla + " pulgadas\n");
        return sb.toString();
    }


}

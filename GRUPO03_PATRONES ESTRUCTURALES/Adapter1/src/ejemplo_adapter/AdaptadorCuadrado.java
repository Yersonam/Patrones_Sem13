package ejemplo_adapter;

//  Implementar el adaptador
//La clase AdaptadorCuadrado implementa la interfaz Forma, proporcionar una implementación para el método calcularArea
class AdaptadorCuadrado implements Forma {
    private Cuadrado cuadrado; // cuadrado que se adaptara

    public AdaptadorCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }// obtener el valor del lado del cuadrado

    public double calcularArea() {
        double lado = cuadrado.getLado();
        return lado * lado;
    }
}
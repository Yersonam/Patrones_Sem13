package ejemplo_adapter;

// Clase Cuadrado existente que se quiere adaptar
class Cuadrado {
    private double lado;

    /*El constructor Cuadrado recibe un parámetro lado y lo asigna al atributo lado de la clase.
    El método getLado() devuelve el valor del lado del cuadrado.
    Estos métodos son utilizados por el adaptador AdaptadorCuadrado para obtener el lado del cuadrado y calcular su área. */

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
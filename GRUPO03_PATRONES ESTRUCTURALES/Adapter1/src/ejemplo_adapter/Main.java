package ejemplo_adapter;

public class Main {
    public static void main(String[] args) {
        // Crear un rectángulo
        Forma rectangulo = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        // Crear un cuadrado utilizando el adaptador
        Cuadrado cuadrado = new Cuadrado(7);
        Forma adaptadorCuadrado = new AdaptadorCuadrado(cuadrado);
        System.out.println("Área del cuadrado: " + adaptadorCuadrado.calcularArea());
    }
}
package Patrones.Strategy;

public class MultiplicacionOperation implements Strategy{
    // Implementaciones concretas de la interfaz Strategy
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

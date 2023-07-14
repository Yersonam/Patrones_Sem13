package Patrones.Strategy;

public class Calculator {
    // Clase que utiliza una implementación concreta de la interfaz Strategy
    private Strategy strategy;

    public Calculator(Strategy strategy){
        this.strategy=strategy;
    }

    //permite intercambiar fácilmente diferentes algoritmos o estrategias
    //según las necesidades
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

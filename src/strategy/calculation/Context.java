package strategy.calculation;


public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float performCalculation(float n1, float n2) {
        return strategy.calculation(n1, n2);
    }

}


package strategy.calculation;


public class CalculationContext {
    private Strategy strategy;

    public CalculationContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setCalculationStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public float performCalculation(float n1, float n2) {
        return strategy.calculation(n1, n2);
    }

}


package strategy.calculation;

public class Subtraction implements Strategy {
    @Override
    public float calculation(float n1, float n2) {
        return n1 - n2;
    }
}

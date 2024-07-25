package strategy.calculation;

public class Multiplication implements Strategy {
    @Override
    public float calculation(float n1, float n2) {
        return n1 * n2;
    }
}

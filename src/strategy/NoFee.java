package strategy;

public class NoFee implements FeeStrategy {

    @Override
    public double calculateFee(double amount) {
        return 0.0;
    }
}

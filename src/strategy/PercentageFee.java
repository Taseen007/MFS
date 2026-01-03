package strategy;

public class PercentageFee implements FeeStrategy {

    private final double rate;

    public PercentageFee(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateFee(double amount) {
        return amount * rate;
    }
}

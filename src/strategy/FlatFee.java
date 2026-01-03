package strategy;

public class FlatFee implements FeeStrategy {

    private final double fee;

    public FlatFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double calculateFee(double amount) {
        return fee;
    }
}

package service;

import strategy.FeeStrategy;

public abstract class MFSService {

    protected FeeStrategy feeStrategy;

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public void processTransaction(double amount) {
        System.out.println("------ MFS Transaction ------");
        validateUser();
        double fee = calculateFee(amount);
        executeTransaction();
        completeTransaction();
        System.out.println("Transaction Fee: " + fee);
        System.out.println("-----------------------------");
    }

    protected abstract void validateUser();
    protected abstract void executeTransaction();

    protected double calculateFee(double amount) {
        return feeStrategy.calculateFee(amount);
    }

    protected void completeTransaction() {
        System.out.println("Transaction successful");
    }

    // Public wrapper methods for decorator delegation
    public void doValidateUser() {
        validateUser();
    }

    public void doExecuteTransaction() {
        executeTransaction();
    }

    public double doCalculateFee(double amount) {
        return calculateFee(amount);
    }

    public void doCompleteTransaction() {
        completeTransaction();
    }
}

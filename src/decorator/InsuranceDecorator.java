package decorator;

import service.MFSService;

public class InsuranceDecorator extends ServiceDecorator {

    public InsuranceDecorator(MFSService service) {
        super(service);
    }

    @Override
    protected void validateUser() {
        service.doValidateUser();
    }

    @Override
    protected void executeTransaction() {
        service.doExecuteTransaction();
    }

    @Override
    protected double calculateFee(double amount) {
        return service.doCalculateFee(amount) + 5.0;
    }

    @Override
    protected void completeTransaction() {
        service.doCompleteTransaction();
        System.out.println("Transaction insurance applied");
    }
}

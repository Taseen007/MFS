package decorator;

import service.MFSService;

public abstract class ServiceDecorator extends MFSService {

    protected MFSService service;

    public ServiceDecorator(MFSService service) {
        this.service = service;
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
        return service.doCalculateFee(amount);
    }

    @Override
    protected void completeTransaction() {
        service.doCompleteTransaction();
    }
}

package decorator;

import service.MFSService;

public class SMSNotificationDecorator extends ServiceDecorator {

    public SMSNotificationDecorator(MFSService service) {
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
        return service.doCalculateFee(amount);
    }

    @Override
    protected void completeTransaction() {
        service.doCompleteTransaction();
        System.out.println("SMS notification sent to user");
    }
}

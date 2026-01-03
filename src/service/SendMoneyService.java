package service;

public class SendMoneyService extends MFSService {

    @Override
    protected void validateUser() {
        System.out.println("Validating sender and receiver...");
    }

    @Override
    protected void executeTransaction() {
        System.out.println("Sending money to another MFS user...");
    }
}

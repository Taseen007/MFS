package service;

public class CashOutService extends MFSService {

    @Override
    protected void validateUser() {
        System.out.println("Validating agent and user...");
    }

    @Override
    protected void executeTransaction() {
        System.out.println("Cashing out money from agent...");
    }
}


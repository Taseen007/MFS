package service;

public class MobileRechargeService extends MFSService {

    @Override
    protected void validateUser() {
        System.out.println("Validating mobile number...");
    }

    @Override
    protected void executeTransaction() {
        System.out.println("Recharging mobile balance...");
    }
}

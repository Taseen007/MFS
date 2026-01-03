package factory;

import service.MFSService;
import service.SendMoneyService;
import service.CashOutService;
import service.MobileRechargeService;
import strategy.PercentageFee;
import strategy.NoFee;

public class MFSServiceFactory {

    public static MFSService createService(String type) {

        if (type.equalsIgnoreCase("SEND")) {
            MFSService service = new SendMoneyService();
            service.setFeeStrategy(new PercentageFee(0.01));
            return service;
        }

        if (type.equalsIgnoreCase("CASHOUT")) {
            MFSService service = new CashOutService();
            service.setFeeStrategy(new PercentageFee(0.015));
            return service;
        }

        if (type.equalsIgnoreCase("RECHARGE")) {
            MFSService service = new MobileRechargeService();
            service.setFeeStrategy(new NoFee());
            return service;
        }

        throw new IllegalArgumentException("Invalid MFS service type: " + type);
    }
}

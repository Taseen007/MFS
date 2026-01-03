import factory.MFSServiceFactory;
import service.MFSService;
import decorator.SMSNotificationDecorator;
import decorator.InsuranceDecorator;

public class Main {
    public static void main(String[] args) {
        MFSService service =
            MFSServiceFactory.createService("SEND");

        service = new SMSNotificationDecorator(service);
        service = new InsuranceDecorator(service);

        service.processTransaction(1000);
    }
}

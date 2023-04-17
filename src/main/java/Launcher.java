import interf.impl.StripPaymentStrategy;
import service.PaymentProcessor;

public class Launcher {

    public static void main(String[] args) {
        StripPaymentStrategy stripPaymentStrategy = new StripPaymentStrategy();
        PaymentProcessor processor = new PaymentProcessor(stripPaymentStrategy);
        processor.processPayment(500);
    }
}

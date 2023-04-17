package interf.impl;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import interf.PaymentStrategy;


public class StripPaymentStrategy implements PaymentStrategy {
    Logger LOGGER = LoggerFactory.getLogger(StripPaymentStrategy.class);
    @Override
    public void processPayment(double amount) {

        LOGGER.warn("I'm in StripPaymentStrategy");
        LOGGER.warn("Amount is : "+amount);
    }
}

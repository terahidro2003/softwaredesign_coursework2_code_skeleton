package payment;

import events.EventInterface;
import misc.Controller;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class PaymentController implements Controller<Payment> {
    private static PaymentController singletonPaymentController;

    public static PaymentController getInstance()
    {
        if(singletonPaymentController == null) singletonPaymentController = new PaymentController();
        return singletonPaymentController;
    }

    public void cancelPayment(Payment payment)
    {}

    public void refundPayment(Payment toRefund)
    {}

    public List<Payment> findAllPayments {return Collections.emptyList();}

    public Payment findPaymentById {return null;}

    /**
     * @param event
     */
    @Override
    public void route(EventInterface event) {

    }

    /**
     * @param creatable
     */
    @Override
    public void create(Payment creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(Payment deletable) {

    }

    /**
     * @param filters
     * @return
     */
    @Override
    public List<?> get(String filters) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Payment find(UUID id) {
        return null;
    }
}

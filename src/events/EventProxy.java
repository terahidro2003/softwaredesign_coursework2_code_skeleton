package events;

import auth.AuthController;
import events.Event;
import notifications.NotificationController;
import payment.PaymentController;
import payment.SubscriptionController;
import support.SupportRequestController;

public class EventProxy implements EventProxyInterface {

    private final AuthController authController;
    private final PaymentController paymentController;
    private final SubscriptionController subscriptionController;
    private final SupportRequestController supportRequestController;
    private final NotificationController notificationController;


    public EventProxy() {
        this.authController = AuthController.getInstance();
        this.paymentController = PaymentController.getInstance();
        this.subscriptionController = SubscriptionController.getInstance();
        this.supportRequestController = SupportRequestController.getInstance();
        this.notificationController = NotificationController.getInstance();
    }

    /**
     *
     */
    @Override
    public void passEvent(Event event) {
        if(checkAccess())
        {
            switch (event.getEventType()){
                case "AUTH":
                    authController.route((EventInterface) event);
                    break;
                case "PAYMENT":
                    paymentController.route((EventInterface) event);
                    break;
                case "SUBSCRIPTION":
                    subscriptionController.route((EventInterface) event);
                    break;
                case "SUPPORT":
                    supportRequestController.route((EventInterface) event);
                    break;
                case "NOTIFICATION":
                    notificationController.route((EventInterface) event);
                    break;
            }
        }
    }

    private boolean checkAccess()
    {
       return AuthController.getInstance().checkLoginStatus();
    }

}

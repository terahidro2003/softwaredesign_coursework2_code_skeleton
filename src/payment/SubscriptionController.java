package payment;

import auth.User;
import events.EventInterface;
import misc.Controller;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class SubscriptionController implements Controller<Subscription> {
    private static SubscriptionController controller;

    public static SubscriptionController getInstance()
    {
        if(controller == null) controller = new SubscriptionController();
        return controller;
    }

    public void cancelSubscription(){}

    public boolean hasUserSubscription(User user){return true;}

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
    public void create(Subscription creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(Subscription deletable) {

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
    public Subscription find(UUID id) {
        return null;
    }
}

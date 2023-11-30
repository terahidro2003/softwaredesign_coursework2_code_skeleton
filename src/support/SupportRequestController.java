package support;

import events.EventInterface;
import misc.Controller;
import payment.SubscriptionController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class SupportRequestController implements Controller<SupportRequest> {
    private static SupportRequestController controller;

    public static SupportRequestController getInstance()
    {
        if(controller == null) controller = new SupportRequestController();
        return controller;
    }
    public void changeRequestStatus(String status, SupportRequest request){}

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
    public void create(SupportRequest creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(SupportRequest deletable) {

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
    public SupportRequest find(UUID id) {
        return null;
    }
}

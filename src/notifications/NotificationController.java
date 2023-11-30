package notifications;

import events.EventInterface;
import misc.Controller;
import notifications.Notification;

import java.util.List;
import java.util.UUID;

public class NotificationController implements Controller<Notification> {
    private static NotificationController controller;
    public static NotificationController getInstance()
    {
        if(controller == null) controller = new NotificationController();
        return controller;
    }
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
    public void create(Notification creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(Notification deletable) {

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
    public Notification find(UUID id) {
        return null;
    }
}

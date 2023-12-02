package bike;

import events.EventInterface;
import misc.Controller;
import notifications.BikeReturnNotification;
import notifications.NotificationController;

import java.util.List;
import java.util.UUID;

public class BikeReservationController implements Controller<BikeReservation> {
    /**
     * @param event
     */
    @Override
    public void route(EventInterface event) {

    }
    public void end(BikeReservation reservation){}
    public void resume(BikeReservation reservation){}
    public void setUsed(BikeReservation reservation) {}

    public void notify(BikeReservation reservation){
        if(reservation.getStatus().equals("expired"))
        {
            NotificationController.getInstance().create(new BikeReturnNotification());
        }
    }

    /**
     * @param creatable
     */
    @Override
    public void create(BikeReservation creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(BikeReservation deletable) {

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
    public BikeReservation find(UUID id) {
        return null;
    }
}

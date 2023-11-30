package bike;

import events.EventInterface;
import misc.Controller;

import java.util.List;
import java.util.UUID;

public class BikeReservationController implements Controller<BikeReservation> {
    public void end(BikeReservation reservation){}
    public void resume(BikeReservation reservation){}


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

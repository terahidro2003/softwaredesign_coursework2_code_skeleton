package bike;

import misc.Controller;

import java.util.List;
import java.util.UUID;

public class BikeController implements Controller<Bike> {
    /**
     * @param creatable
     */
    @Override
    public void create(Bike creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(Bike deletable) {

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
    public Bike find(UUID id) {
        return null;
    }
}

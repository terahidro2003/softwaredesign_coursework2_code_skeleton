package bike;

import java.util.UUID;

public class Bike {
    private UUID id;
    private BikeReservation reservation;
    private Location location;

    static class Location{
        int x;
        int y;
    }

    public boolean isBikeAvailable()
    {
        return !(reservation == null);
    }
}

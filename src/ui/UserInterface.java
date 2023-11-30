package ui;

import events.EventProxy;
import events.EventProxyInterface;

interface UserInterface {
    public final EventProxyInterface eventProxy = new EventProxy();
    void loginScreen();
    void signupScreen();
    void paymentScreen();
    void subscriptionScreen();
    void supportScreen();
    void bikeAvailabilityScreen();
    void bikeListScreen();
    void bikeReservationScreen();
    void bikeReturnScreen();
}

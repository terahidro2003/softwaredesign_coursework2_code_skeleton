package payment;

import auth.User;
import payment.Payment;

import java.time.LocalDateTime;

public class Subscription {
    private String name;
    private int duration;
    private LocalDateTime madeActive;
    private Payment payment;
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getMadeActive() {
        return madeActive;
    }

    public void setMadeActive(LocalDateTime madeActive) {
        this.madeActive = madeActive;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
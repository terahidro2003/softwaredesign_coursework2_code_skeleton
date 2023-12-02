package payment;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    UUID id;
    LocalDateTime dateMade;
    Double amount = 5.00;
    String status;

    Payment()
    {

    }

    Payment(double amount)
    {
        this.amount = amount;
    }
}

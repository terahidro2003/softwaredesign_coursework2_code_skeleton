package payment;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    UUID id;
    LocalDateTime dateMade;
    Double amount;
    String status;
}

package auth;

import events.EventInterface;

public class AuthEvent implements EventInterface {
    private String type;
    private User user;
}

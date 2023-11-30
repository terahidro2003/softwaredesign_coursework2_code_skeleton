package support;

import auth.User;

import java.time.LocalDateTime;

public class SupportRequest {
    private User reporter;
    private User assignee;
    private String description;
    private LocalDateTime timeCreated;
}

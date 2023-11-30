package events;

public class Event {
    private String eventType;
    private EventInterface message;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public EventInterface getMessage() {
        return message;
    }

    public void setMessage(EventInterface message) {
        this.message = message;
    }
}

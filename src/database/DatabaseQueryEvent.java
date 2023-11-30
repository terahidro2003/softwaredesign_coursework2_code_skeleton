package database;

import events.EventInterface;

public class DatabaseQueryEvent implements EventInterface {
    private String query;
    private String parameters;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}

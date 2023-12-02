package database;

public interface GDPRProxyInterface {
    void passDatabaseQuery(DatabaseQueryEvent event);
    boolean checkGDPRCompliance(DatabaseQueryEvent event);
    void minimizeData(DatabaseQueryEvent event);
}

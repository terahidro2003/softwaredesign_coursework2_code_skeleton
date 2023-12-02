package database;

import events.EventProxy;
import events.EventProxyInterface;

public class GDPRProxy implements GDPRProxyInterface{
    private final DatabaseDAOInterface<DatabaseQueryEvent> databaseService;
    private final EventProxyInterface eventProxy;

    GDPRProxy()
    {
        this.databaseService = new MySQLDatabaseConnection();
        this.eventProxy = new EventProxy();
    }
    /**
     * @param event
     */
    @Override
    public void passDatabaseQuery(DatabaseQueryEvent event) {
        minimizeData(event);
        if(checkGDPRCompliance(event))
        {
            databaseService.customOperation(event.getQuery());
        }
    }

    /**
     * @param event
     * @return
     */
    @Override
    public boolean checkGDPRCompliance(DatabaseQueryEvent event) {
        return false;
    }

    /**
     * @param event
     */
    @Override
    public void minimizeData(DatabaseQueryEvent event) {

    }
}

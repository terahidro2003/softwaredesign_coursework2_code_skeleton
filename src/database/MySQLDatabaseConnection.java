package database;

import java.util.List;

public class MySQLDatabaseConnection implements DatabaseDAOInterface<DatabaseQueryEvent>{
    private final static String hostname = "localhost";
    private final static Integer port = 3306;
    private final static String database = "bikeRentalLeipzigProd";
    private final static String username = "root";
    private final static String password = "toor";


    /**
     *
     */
    @Override
    public void connect() {

    }

    /**
     * @param toCreate
     */
    @Override
    public void save(DatabaseQueryEvent toCreate) {

    }

    /**
     * @param toDelete
     */
    @Override
    public void delete(DatabaseQueryEvent toDelete) {

    }

    /**
     * @param toUpdate
     */
    @Override
    public void update(DatabaseQueryEvent toUpdate) {

    }

    /**
     * @param filter
     * @return
     */
    @Override
    public List<DatabaseQueryEvent> get(String filter) {
        return null;
    }

    /**
     * @param filter
     * @return
     */
    @Override
    public DatabaseQueryEvent find(String filter) {
        return null;
    }

    /**
     * @param filter
     * @return
     */
    @Override
    public List<DatabaseQueryEvent> customSelect(String filter) {
        return null;
    }

    /**
     * @param query
     */
    @Override
    public void customOperation(String query) {

    }
}

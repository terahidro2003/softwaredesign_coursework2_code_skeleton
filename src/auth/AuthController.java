package auth;

import events.EventInterface;
import misc.Controller;

import java.util.List;
import java.util.UUID;

public class AuthController implements Controller<User> {
    private static AuthController singletonAuthController;
    private User currentUser;

    public static AuthController getInstance()
    {
        if(singletonAuthController == null) singletonAuthController = new AuthController();
        return singletonAuthController;
    }



    public void login(String username, String password)
    {

    }

    public boolean checkLoginStatus()
    {
        return true;
    }

    /**
     * @param event
     */
    @Override
    public void route(EventInterface event) {

    }

    /**
     * @param creatable
     */
    @Override
    public void create(User creatable) {

    }

    /**
     * @param deletable
     */
    @Override
    public void remove(User deletable) {

    }

    /**
     * @param filters
     * @return
     */
    @Override
    public List<?> get(String filters) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User find(UUID id) {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Stateful;

/**
 *
 * @author pedro
 */
@Stateful
public class CoreSessionBean implements User{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private Entities.User user;

    @PostConstruct
    public void initialize() {
    }
    
    public Entities.User getUser() {
        return user;
    }

    public void setUser(Entities.User user) {
        this.user = user;
    }
    
    public boolean isLogged(){
        return user != null;
    }
}

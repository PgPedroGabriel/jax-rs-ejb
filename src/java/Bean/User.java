/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author pedro
 */
@Remote
public interface User {
    public boolean isLogged();
    public void setUser(Entities.User user);
    public Entities.User getUser();
}

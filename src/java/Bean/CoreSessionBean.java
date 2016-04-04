/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author pedro
 */
@Stateful
public class CoreSessionBean implements CoreInterface{

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private Entities.User user;
    private Entities.Cart cart;

    @PostConstruct
    public void initialize() {
        cart = new Entities.Cart();
        user = new Entities.User();
    }
    
    @Override
    public Entities.User getUser() {
        return user;
    }

    @Override
    public void setUser(Entities.User user) {
        this.user = user;
    }
    
    @Override
    public boolean isLogged(){
        return user != null;
    }

    @Override
    public Entities.Cart getCart() {
        return cart;
    }

    @Override
    public void setCart(Entities.Cart cart) {
        this.cart = cart;
    }
    
    @Override
    public void addInCart(Entities.Event e, Integer quantity){
        cart.add(e, quantity);
    }
    
    @Override
    public void removeInCart(Entities.Event e, Integer quantity){
        cart.remove(e, quantity);
    }
    
    @Override
    public Map<String, Entities.BaseEntity> getSession(){
        
        Map<String, Entities.BaseEntity> map = new HashMap<String, Entities.BaseEntity>();
        
        map.put("user", user);
        map.put("cart", cart);
        
        return map;
    }
}

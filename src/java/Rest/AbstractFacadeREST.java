/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author pedro
 */
public abstract class AbstractFacadeREST {
    
    protected final Gson gson;
    
    public AbstractFacadeREST() {
        gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
    }
    
}

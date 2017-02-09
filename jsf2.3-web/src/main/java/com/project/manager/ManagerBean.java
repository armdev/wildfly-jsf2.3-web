package com.project.manager;

import com.project.client.ContactsRESTClient;
import com.project.entities.Contacts;
import java.io.Serializable;
import java.util.List;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author armdev
 */
@Named(value = "managerBean")
@ViewScoped
public class ManagerBean implements Serializable{

    private static final long serialVersionUID = 3112637813849153987L;
    
    @Inject
    private ContactsRESTClient restClient;
    
    public ManagerBean() {
     
    }
    
    public List<Contacts> findAll(){
        return restClient.findAll(List.class);
    } 
    

    
}

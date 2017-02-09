package com.project.facades;

import com.project.entities.Contacts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author armdev
 */
@Stateless
public class ContactsFacade extends AbstractFacade<Contacts> {

    @PersistenceContext(unitName = "mydb")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactsFacade() {
        super(Contacts.class);
    }
    
}

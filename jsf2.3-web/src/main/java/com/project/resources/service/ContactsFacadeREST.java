package com.project.resources.service;

import com.project.entities.Contacts;
import com.project.facades.ContactsFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author armdev
 */
@Stateless
@Path("/v1/contacts")
public class ContactsFacadeREST {

    @EJB
    private ContactsFacade contactsFacade;

    public ContactsFacadeREST() {
      
    }

    @POST  
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Contacts entity) {
        contactsFacade.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Contacts entity) {
        contactsFacade.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        contactsFacade.remove(contactsFacade.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Contacts find(@PathParam("id") Integer id) {
        return contactsFacade.find(id);
    }

    @GET 
    @Produces({MediaType.APPLICATION_JSON})
    public List<Contacts> findAll() {
        return contactsFacade.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Contacts> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return contactsFacade.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(contactsFacade.count());
    }

 
    
}

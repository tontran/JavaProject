/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Hotelbooking;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Ton Tran
 */
@Stateful
@LocalBean
public class BookingSession implements BookingSessionRemote{

    @javax.persistence.PersistenceContext(unitName="FinalProject-ejbPU")
    private EntityManager em ;
    
    public BookingSession(){
    
    }
    
    
    public void insertBooking(Hotelbooking booking) {
       /* Query insertQuery = em.p.createNamedQuery("Hotelbooking.addBooking");
        insertQuery.setParameter(1, booking.);*/
        em.persist(booking);
    }

    // still in confuse
    public void updateBooking(String id) {
        em.merge(id);
    }

    
    public void deleteBooking(String id) {
        em.remove(em.merge(id));
    }

    @Override
    public List<Hotelbooking> findAllBooking() {
        Query query = em.createNamedQuery("Hotelbooking.findAll");
        return query.getResultList();
    }

    
}

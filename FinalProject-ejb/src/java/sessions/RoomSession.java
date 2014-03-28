/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Hotelroom;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Ton Tran
 */
@Stateful
public class RoomSession implements RoomSessionRemote {

    @javax.persistence.PersistenceContext(unitName="FinalProject-ejbPU")
    private EntityManager em ;
    
    public RoomSession(){
    
    }
    
    @Override
    public List<Hotelroom> showAllAvailableRoom() {
        Query query = em.createNamedQuery("Hotelroom.findAll");
        return query.getResultList();
    }
    
    @Override
    public List<Hotelroom> allAvailableRoom(char status) {
        Query query = em.createNamedQuery("Hotelroom.findByStatus");

        return query.setParameter("status",status).getResultList();
    }
    
}

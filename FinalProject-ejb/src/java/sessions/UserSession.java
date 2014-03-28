/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Hoteluser;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Ton Tran
 */
@Stateful
public class UserSession implements UserSessionRemote {

    @javax.persistence.PersistenceContext(unitName="FinalProject-ejbPU")
    private EntityManager em ;
    
    public UserSession(){
    
    }
    
    @Override
    public Hoteluser findUserByName(String username) {
       // Customer cust = (Customer)em.find(Customer.class, id);
        Query query = em.createNamedQuery("Hoteluser.findByUsername");
        Hoteluser user = (Hoteluser) query.setParameter("username", username).getSingleResult();
        return user;
    }

   
}

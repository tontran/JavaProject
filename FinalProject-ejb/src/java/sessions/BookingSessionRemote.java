/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Hotelbooking;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Ton Tran
 */
@Remote
public interface BookingSessionRemote {
//    public void insertBooking(Hotelbooking booking);
//    public void updateBooking(String id);
//    public void deleteBooking(String id);
    List<Hotelbooking> findAllBooking();
  //  public void requestServices();
}

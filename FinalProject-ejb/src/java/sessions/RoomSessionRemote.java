/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Hotelroom;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Ton Tran
 */
@Remote
public interface RoomSessionRemote {
    //Hotelroom findAllRoom(String id);
    List<Hotelroom> showAllAvailableRoom();
    List<Hotelroom> allAvailableRoom(char status);
}
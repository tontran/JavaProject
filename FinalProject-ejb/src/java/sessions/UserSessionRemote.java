/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessions;

import entities.Hoteluser;
import javax.ejb.Remote;

/**
 *
 * @author Ton Tran
 */
@Remote
public interface UserSessionRemote {
    
    Hoteluser findUserByName(String username);
    
}

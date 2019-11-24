/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudiface;

import ENTITAS.entitaslogin;
import view.login;

/**
 *
 * @author ASUS
 */
public interface crudinloginiface {
        public entitaslogin login(String pass,login login);
        public entitaslogin GantiPassword(String pass);
        public void changePassword(entitaslogin a);
        
        
}

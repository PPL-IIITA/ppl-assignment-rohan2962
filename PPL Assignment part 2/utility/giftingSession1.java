/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import Dating_world2.dating_world2;

import Dating_world2.couple;
import java.io.IOException;
import java.util.ArrayList;

/**
 *gifting session type 2
 * @author rohan
 */
public class giftingSession1 extends gifting{

    @Override
    public void gift_giving() throws IOException {
        log_generator lg= new log_generator();
        ArrayList<couple> couples = dating_world2.couples;
        for (couple c : couples)
        {
            c.give_gifts1();
            lg.log_event(2, c.guy.name, c.gal.name);
        }
    }
    
}

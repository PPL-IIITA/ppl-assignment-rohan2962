/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import Dating_world2.dating_world2;

import Dating_world2.couple;
import Dating_world2.gift;
import java.io.IOException;
import java.util.ArrayList;

/**
 * gifting session
 *
 * @author rohan
 */
public class giftingSession extends gifting {

    @Override
    public void gift_giving() throws IOException {
        log_generator lg = new log_generator();
        ArrayList<couple> couples = dating_world2.couples;
        for (couple c : couples) {
            c.give_gifts();
            lg.log_event(2, c.guy.name, c.gal.name);
        }
    }

    public void gift_giving(ArrayList<gift> gifts) throws IOException {
        ArrayList<couple> couples = dating_world2.couples;
        log_generator lg = new log_generator();
        for (couple c : couples) {
            c.give_gifts(gifts);
            lg.log_event(2, c.guy.name, c.gal.name);
        }
    }
}

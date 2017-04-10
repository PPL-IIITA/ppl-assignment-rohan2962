/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import static Dating_world2.dating_world2.couples;
import static Dating_world2.dating_world2.men;
import Dating_world2.boy;
import Dating_world2.couple;
import Dating_world2.girl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * breakup class
 *
 * @author rohan
 */
public class loveDestroyer {

    /**
     * breakup function
     *
     * @param c couple to be broken up
     * @throws IOException
     */
    public void breakup(couple c) throws IOException {
        log_generator lg = new log_generator();
        lg.log_event(3, c.guy.name, c.gal.name);
        girl g;
        boy b;
        int index;
        g = c.gal;
        b = c.guy;
        index = men.indexOf(b);
        couples.remove(c);

        loveFinder l = new loveFinder();
        try {
            b = l.find_match(g, index);
            g.get_committed(b);
            b.get_committed(g);
            couple c1 = new couple(g, b);
            couples.add(c1);
            lg.log_event(1, c1.guy.name, c1.gal.name);
        } catch (Exception ex) {
            System.out.println("no one found for " + g.name);
        }

    }
}

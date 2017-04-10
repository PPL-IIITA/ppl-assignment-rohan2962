/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import Dating_world2.dating_world2;

import Dating_world2.boy;
import Dating_world2.couple;
import Dating_world2.gift;
import Dating_world2.girl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import utility.giftingSession;
import utility.log_generator;
import utility.loveFinder;
import utility.relationship_parameters_calculation;

/**
 *question 3
 * @author rohan
 */
public class q3 {

    public static void main(String[] args) throws IOException {
        dating_world2.getdata();
        log_generator lg= new log_generator();
        loveFinder l = new loveFinder();
        boy b;
        ArrayList<boy> men = dating_world2.men;
        ArrayList<girl> women = dating_world2.women;
        lg.log_event(men.size() + " boys  " + women.size() + " girls read");
        ArrayList<couple> couples = dating_world2.couples;
        for (girl w : women) {
            b = l.find_match(w);
            if (b != null) {
                w.get_committed(b);
                b.get_committed(w);
                couple c = new couple(w, b);
                couples.add(c);
                lg.log_event(1, c.guy.name, c.gal.name);
            }
        }
        lg.log_event(couples.size() + "  couples formed");

        Collections.sort(dating_world2.gifts, new Comparator<gift>() {
            @Override
            public int compare(gift t, gift t1) {
                return t.price > t1.price ? 1 : t.price < t1.price ? -1 : 0;
            }

        });
        giftingSession gs = new giftingSession();
        gs.gift_giving();
        relationship_parameters_calculation h = new relationship_parameters_calculation();
        for (couple c : couples) {
            h.happiness_calculator(c);
            h.compatibility_calculator(c);
        }

        couple c;
        int k = 0, i;
        BufferedReader br = null;
        FileReader fr = null;
        fr = new FileReader("q3_k");
        br = new BufferedReader(fr);
        k = br.read();
        Collections.sort(couples, new Comparator<couple>() {
            @Override
            public int compare(couple t, couple t1) {
                return t.happiness < t1.happiness ? 1 : t.happiness > t1.happiness ? -1 : 0;
            }

        });
        System.out.println(k + " happiest couples");
        for (i = 0; i < k && i < couples.size(); i++) {
            c = couples.get(i);
            c.display_happiness();
        }
        Collections.sort(couples, new Comparator<couple>() {
            @Override
            public int compare(couple t, couple t1) {
                return t.compatibility > t1.compatibility ? 1 : t.compatibility < t1.compatibility ? -1 : 0;
            }

        });
        System.out.println(k + " most compatible couples");
        for (i = 0; i < k; i++) {
            c = couples.get(i);
            c.display_compatibility();
        }
        lg.log_close();
        
    }
}

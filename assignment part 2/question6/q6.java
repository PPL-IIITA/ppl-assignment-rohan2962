/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import Dating_world2.dating_world2;

import Dating_world2.boy;
import Dating_world2.couple;
import Dating_world2.girl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import utility.giftingSession;
import utility.log_generator;
import utility.loveDestroyer;
import utility.loveFinder;
import utility.relationship_parameters_calculation;
import utility.test_case_generator;

/**
 * question 6
 *
 * @author rohan
 */
public class q6 {

    public static void main(String[] args) throws IOException {
        dating_world2.getdata();
        log_generator lg = new log_generator();
        loveFinder l = new loveFinder();
        test_case_generator tcg = new test_case_generator();
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
        int j;
        int k = 0, i;
        BufferedReader br = null;
        FileReader fr = null;
        fr = new FileReader("q3_k");
        br = new BufferedReader(fr);
        k = br.read();
        for (j = 0; j < k; j++) {
            tcg.gen_gift_data();
            System.out.println("day " + (j + 1));
            lg.log_event("events of day " + (j + 1));
            giftingSession gs = new giftingSession();
            gs.gift_giving();
            relationship_parameters_calculation h = new relationship_parameters_calculation();
            for (couple c : couples) {
                h.happiness_calculator(c);
                h.compatibility_calculator(c);
            }

            couple c;

            Collections.sort(couples, new Comparator<couple>() {
                @Override
                public int compare(couple t, couple t1) {
                    return t.happiness > t1.happiness ? 1 : t.happiness < t1.happiness ? -1 : 0;
                }

            });
            loveDestroyer ld = new loveDestroyer();
            for (i = 0; i < k && i < couples.size(); i++) {
                c = couples.get(i);
                c.display_happiness();
                ld.breakup(c);

            }
            System.out.println(couples.size() + " left");
        }
        lg.log_close();
    }

}

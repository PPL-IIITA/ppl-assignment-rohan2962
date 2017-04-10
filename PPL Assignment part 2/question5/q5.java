/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

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
import java.util.List;
import utility.giftingSession;
import utility.log_generator;
import utility.loveFinder;
import utility.relationship_parameters_calculation;
import utility.test_case_generator;

/**
 * question 5
 *
 * @author rohan
 */
public class q5 {

    public static void main(String[] args) throws IOException {
        ArrayList<boy> men = dating_world2.men;
        ArrayList<girl> women = dating_world2.women;
        ArrayList<couple> couples = dating_world2.couples;
        loveFinder lf = new loveFinder();
        log_generator lg = new log_generator();
        if (men.isEmpty()) {
            dating_world2.getdata();
        }

        int bi, gi;
        int i;

        boy b = men.get(0);
        girl g = women.get(0);
        Collections.sort(men, new Comparator<boy>() {
            @Override
            public int compare(boy t, boy t1) {
                return t.attractiveness > t1.attractiveness ? 1 : t.attractiveness < t1.attractiveness ? -1 : 0;
            }

        });
        Collections.sort(women, new Comparator<girl>() {
            @Override
            public int compare(girl t, girl t1) {
                return t.maintainence_cost < t1.maintainence_cost ? 1 : t.maintainence_cost > t1.maintainence_cost ? -1 : 0;
            }

        });
        List<girl> women1 = new ArrayList<girl>(women);
        for (bi = 0, gi = 0, i = 0; bi < men.size() && gi < women1.size(); i++) {
            if (i % 2 != 0) {
                while (bi < men.size() - 1 && men.get(bi).get_relationship_status()) {
                    bi++;
                }
                b = men.get(bi);
                if (!b.get_relationship_status()) {
                    g = lf.find_match1(b);
                    bi++;
                }
            } else {
                while (gi < women1.size() - 1 && women1.get(gi).get_relationship_status()) {
                    gi++;
                }
                g = women1.get(gi);
                if (!g.get_relationship_status()) {
                    b = lf.find_match1(g);
                    gi++;
                }
            }
            if (g != null && b != null && !g.get_relationship_status()) {
                g.get_committed(b);
                b.get_committed(g);
                couple c = new couple(g, b);
                couples.add(c);
                lg.log_event(1, c.guy.name, c.gal.name);
            }
        }
        lg.log_event(couples.size() + " couples formed");
        giftingSession gs = new giftingSession();
        gs.gift_giving();
        relationship_parameters_calculation h = new relationship_parameters_calculation();
        for (couple c : couples) {
            h.happiness_calculator(c);
            h.compatibility_calculator(c);
        }

        couple c;
        int k;
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
        lg.log_close();
    }
}

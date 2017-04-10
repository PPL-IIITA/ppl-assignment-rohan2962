/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import Dating_world2.dating_world2;
import static Dating_world2.dating_world2.gifts;
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
import utility.gifting;
import utility.giftingSession;
import utility.giftingSession1;
import utility.log_generator;
import utility.loveFinder;
import utility.relationship_parameters_calculation;
import utility.template_best_k;

/**
 *
 * @author rohan
 */
public class q9 {
     public static void main(String[] args) throws IOException {
        dating_world2.getdata();
        log_generator lg= new log_generator();
        loveFinder l = new loveFinder();
        boy b;
        template_best_k<boy> men_k = new template_best_k<>();
        ArrayList<boy> men = dating_world2.men;
        for(boy m : men){
            men_k.add(m);
        }
        ArrayList<girl> women = dating_world2.women;
        template_best_k<girl> women_k = new template_best_k<>();
        for(girl w:women){
            women_k.add(w);
        }
        lg.log_event(men.size() + " boys  " + women.size() + " girls read");
        ArrayList<couple> couples = dating_world2.couples;
        int k = 0, i;
        BufferedReader br = null;
        FileReader fr = null;
        fr = new FileReader("q3_k");
        br = new BufferedReader(fr);
        k = br.read();
        for (girl w : women) {
            b = l.find_match(w,men_k.best_k(new Comparator<boy>(){
                @Override
                public int compare(boy t, boy t1) {
                     return t.attractiveness>t1.attractiveness?1:t.attractiveness<t1.attractiveness?-1:0;
                }
                
                
            }, k));
            if (b != null) {
                w.get_committed(b);
                b.get_committed(w);
                couple c = new couple(w, b);
                couples.add(c);
                lg.log_event(1, c.guy.name, c.gal.name);
            }
        }
        lg.log_event(couples.size() + "  couples formed");

        template_best_k<gift> gifts_k = new template_best_k<>();
        for(gift g:gifts)
        {
            gifts_k.add(g);
        }
        giftingSession gs = new giftingSession();
        gs.gift_giving(gifts_k.best_k(new Comparator<gift>(){
            @Override
            public int compare(gift t, gift t1) {
                return t.value < t1.value ? 1 : t.value > t1.value ? -1 : 0;
            }
            
        }, k));
        relationship_parameters_calculation h = new relationship_parameters_calculation();
        for (couple c : couples) {
            h.happiness_calculator(c);
            h.compatibility_calculator(c);
        }
        lg.log_close();
    }
}

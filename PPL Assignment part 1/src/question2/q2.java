/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import dating_world.couple;
import dating_world.dating_world;
import dating_world.gift;
import utility.giftingSession;
import utility.loveFinder;
import utility.relationship_parameters_Calculation;
import static dating_world.dating_world.couples;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Question 2 executable
 * @author rohan
 */
public class q2 {

    public static void main(String[] args) throws IOException {
        dating_world.getdata();
        loveFinder l = new loveFinder();
        l.make_match();
        Collections.sort(dating_world.gifts, new Comparator<gift>() {
            @Override
            public int compare(gift t, gift t1) {
                return t.price > t1.price ? 1 : t.price < t1.price ?-1:0;
            }

        });
        giftingSession g = new giftingSession();
        g.gift_giving();
        int k = 0, i;
        BufferedReader br = null;
        FileReader fr = null;
        fr = new FileReader("q2_k");
        br = new BufferedReader(fr);
        k = br.read();

        relationship_parameters_Calculation h = new relationship_parameters_Calculation();
        h.calculator();
        Collections.sort(couples, new Comparator<couple>() {
            @Override
            public int compare(couple t, couple t1) {
                return t.happiness < t1.happiness ? 1 : t.happiness > t1.happiness?-1:0;
            }

        });
        couple c;
        System.out.println(k + " happiest couples");
        for (i = 0; i < k && i < couples.size(); i++) {
            c = couples.get(i);
            c.display();
        }
        Collections.sort(couples, new Comparator<couple>() {
            @Override
            public int compare(couple t, couple t1) {
                return t.compatibility > t1.compatibility ? 1 : t.compatibility < t1.compatibility?-1:0;
            }

        });
        System.out.println(k + " most compatible couples");
        for (i = 0; i < k; i++) {
            c = couples.get(i);
            c.display();
        }
    }
}

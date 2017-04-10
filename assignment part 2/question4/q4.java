/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import Dating_world2.dating_world2;
import Dating_world2.boy;
import Dating_world2.couple;
import Dating_world2.girl;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import question3.q3;
import utility.loveDestroyer;

/**
 *question 4
 * @author rohan
 */
public class q4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<boy> men = dating_world2.men;
        ArrayList<girl> women = dating_world2.women;
        ArrayList<couple> couples = dating_world2.couples;
        if (men.isEmpty()) {
            q3.main(args);
        }
        int k = 0, i;
        BufferedReader br = null;
        FileReader fr = null;
        fr = new FileReader("q3_k");
        br = new BufferedReader(fr);
        k = br.read();
        Collections.sort(couples, new Comparator<couple>() {
            @Override
            public int compare(couple t, couple t1) {
                return t.happiness > t1.happiness ? 1 : t.happiness < t1.happiness ? -1 : 0;
            }

        });
        couple c;
        loveDestroyer ld = new loveDestroyer();
        for (i = 0; i < k && i < couples.size(); i++) {
            c = couples.get(i);
            c.display_happiness();
            ld.breakup(c);

        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import dating_world.boy;
import dating_world.couple;
import dating_world.dating_world;
import dating_world.girl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author rohan
 */
public class loveFinder {

    public void make_match() throws IOException {
        ArrayList<boy> men = dating_world.men;
        ArrayList<girl> women = dating_world.women;
        ArrayList<couple> couples = dating_world.couples;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        FileWriter fw = new FileWriter("EventLog");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Time\t\t\t\tboy\t\tgirl\t\tEvent\t\t\t\tEventDescription\n");
        for (girl g : women) {
            for (boy b : men) {
                if (g.maintainence_cost <= b.budget && g.attractiveness >= b.min_attraction_required && !b.get_relationship_status()) {
                    couple c = new couple(g, b);
                    couples.add(c);
                    g.get_committed(b);
                    b.get_committed(g);
                    bw.write(timestamp.toString());
                    bw.write("\t");
                    bw.write(c.guy.name + "\t" + c.gal.name + "\t" + "Couple formed\t" + c.guy.budget+" "+c.gal.maintainence_cost + "\n");
                    //c.display();
                    break;
                }
            }
        }
        bw.close();
        fw.close();
    }
}

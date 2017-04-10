/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import dating_world.couple;
import dating_world.dating_world;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author rohan
 */
public class giftingSession {
    public void gift_giving() throws IOException
    {
        ArrayList <couple> couples = dating_world.couples;
        Timestamp timestamp;
        FileWriter fw = new FileWriter("EventLog",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Time\t\t\t\tboy\t\tgirl\t\tEvent\t\t\t\tEventDescription\n");
        for(couple c : couples)
        {
            c.give_gifts();
            timestamp = new Timestamp(System.currentTimeMillis());
            bw.write(timestamp.toString());
            bw.write("\t");
            bw.write(c.guy.name+"\t"+c.gal.name+"\t"+"Gift given\t"+c.guy.get_gift_val()+"\n");
            
        }
        bw.close();
        fw.close();
        
    }
}

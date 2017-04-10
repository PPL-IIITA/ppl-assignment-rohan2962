/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

/**
 * log generator
 *
 * @author rohan
 */
public class log_generator {

    Timestamp timestamp;
    FileWriter fw = new FileWriter("EventLog.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);

    public log_generator() throws IOException {

        fw = new FileWriter("EventLog.txt");
        bw.write("Time\t\t\t\tboy\t\tgirl\t\tEvent\t\t\t\tEventDescription");
        bw.newLine();
    }

    /**
     *
     * @param s string to be displayed
     * @throws IOException
     */
    public void log_event(String s) throws IOException {
        timestamp = new Timestamp(System.currentTimeMillis());
        bw.write(timestamp.toString());
        bw.write("\t\t--\t\t--\t\t--\t\t" + s);
        bw.newLine();
    }

    /**
     *
     * @param type type of event
     * @param bname boy name
     * @param gname girl name
     * @throws IOException
     */
    public void log_event(int type, String bname, String gname) throws IOException {
        timestamp = new Timestamp(System.currentTimeMillis());
        bw.write(timestamp.toString());
        switch (type) {
            case 1:
                bw.write("\t\t" + bname + "\t\t" + gname + "\t\tcouple formed");
                break;
            case 2:
                bw.write("\t\t" + bname + "\t\t" + gname + "\t\tgift given");
                break;
            case 3:
                bw.write("\t\t" + bname + "\t\t" + gname + "\t\tbreakup");
                break;
            default:
                break;
        }
        bw.newLine();
    }

    /**
     * close log
     *
     * @throws IOException
     */
    public void log_close() throws IOException {
        bw.close();
        fw.close();
    }
}

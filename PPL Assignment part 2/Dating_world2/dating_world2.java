/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * gets and contains all the data
 *
 * @author rohan
 */
public class dating_world2 {

    /**
     * women in the dating world
     */
    public static ArrayList<girl> women = new ArrayList<>();
    /**
     * men in the dating world
     */
    public static ArrayList<boy> men = new ArrayList<>();
    /**
     * couples in the dating world
     */
    public static ArrayList<couple> couples = new ArrayList<>();
    /**
     * all the gifts available
     */
    public static ArrayList<gift> gifts = new ArrayList<>();

    /**
     * gets input from files
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void getdata() throws FileNotFoundException, IOException {
        FileReader fr;
        BufferedReader br;
        int n, i;
        int a, m, bu, in, co;
        String name;
        boy b;
        girl g;
        gift gi;
        fr = new FileReader("boy_data");
        br = new BufferedReader(fr);
        n = br.read();
        br.readLine();
        for (i = 0; i < n; i++) {
            name = br.readLine();
            a = br.read();
            br.readLine();
            m = br.read();
            br.readLine();
            bu = br.read();
            br.readLine();
            in = br.read();
            br.readLine();
            co = br.read();
            br.readLine();
            if (co == 1) {
                b = new miser_boy(name, a, m, bu, in);
            } else if (co == 2) {
                b = new generous_boy(name, a, m, bu, in);
            } else {
                b = new geek_boy(name, a, m, bu, in);
            }
            men.add(b);
        }
        fr.close();
        br.close();
        fr = new FileReader("girl_data");
        br = new BufferedReader(fr);
        n = br.read();
        br.readLine();
        for (i = 0; i < n; i++) {
            name = br.readLine();
            a = br.read();
            br.readLine();
            bu = br.read();
            br.readLine();
            in = br.read();
            br.readLine();
            co = br.read();
            br.readLine();
            if (co == 1) {
                g = new choosy_girl(name, a, bu, in);
            } else if (co == 2) {
                g = new normal_girl(name, a, bu, in);
            } else {
                g = new desperate_girl(name, a, bu, in);
            }
            women.add(g);
        }
        fr.close();
        br.close();
        fr = new FileReader("gift_data");
        br = new BufferedReader(fr);
        n = br.read();
        for (i = 0; i < n; i++) {

            a = br.read();
            m = br.read();
            co = br.read();
            if (co == 1) {
                gi = new essential_gift(a, m);
            } else if (co == 2) {
                gi = new luxury_gift(a, m);
            } else {
                gi = new utility_gift(a, m);
            }
            gifts.add(gi);
        }
        fr.close();
        br.close();
    }

}

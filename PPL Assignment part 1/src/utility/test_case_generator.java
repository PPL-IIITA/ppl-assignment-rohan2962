/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.BufferedWriter;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rohan
 */
public class test_case_generator {

    private static final String FILENAME = "boy_data";
    private static final String FILENAME1 = "girl_data";
    private static final String FILENAME2 = "gift_data";
    private static final String FILENAME3 = "q2_k";

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        BufferedWriter bw ;
        FileWriter fw ;
        int n, i;
        n = rand.nextInt(500) + 500;
        fw = new FileWriter(FILENAME);
        bw = new BufferedWriter(fw);
        bw.write(n);
        bw.write("\n");
        for (i = 0; i < n; i++) {
            bw.write("boy_" + (i + 1));
            bw.write("\n");
            bw.write(rand.nextInt(100) + 1);
            bw.write("\n");
            bw.write(rand.nextInt(100) + 50);
            bw.write("\n");
            bw.write(rand.nextInt(100) + 50);
            bw.write("\n");
            bw.write(rand.nextInt(100) + 1);
            bw.write("\n");
            bw.write(rand.nextInt(2) + 1);
            bw.write("\n");
        }
        bw.close();
        fw.close();
        n = rand.nextInt(200) + 200;

        fw = new FileWriter(FILENAME1);
        bw = new BufferedWriter(fw);

        bw.write(n);
        bw.write("\n");

        for (i = 0; i < n; i++) {
            bw.write("girl_" + (i + 1));
            bw.write("\n");
            bw.write(rand.nextInt(100) + 50);
            bw.write("\n");
            bw.write(rand.nextInt(100) + 50);
            bw.write("\n");
            bw.write(rand.nextInt(100) + 1);
            bw.write("\n");
            bw.write(rand.nextInt(2) + 1);
            bw.write("\n");
        }
        bw.close();
        fw.close();
        n = rand.nextInt(1000) + 1000;
        fw = new FileWriter(FILENAME2);
        bw = new BufferedWriter(fw);
        bw.write(n);
        bw.write("\n");
        for (i = 0; i < n; i++) {
            bw.write(rand.nextInt(90) + 10);
            bw.write("\n");
            bw.write(rand.nextInt(100) + 50);
            bw.write("\n");
            bw.write(rand.nextInt(2) + 1);
            bw.write("\n");
        }
        bw.close();
        fw.close();
        n = rand.nextInt(20) + 20;
        fw = new FileWriter(FILENAME3);
        bw = new BufferedWriter(fw);
        bw.write(n);
        bw.write("\n");
        bw.close();
        fw.close();
    }

}

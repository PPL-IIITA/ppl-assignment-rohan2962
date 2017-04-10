/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import static Dating_world2.dating_world2.men;
import java.io.IOException;
import java.util.Scanner;
import question3.q3;

/**
 * question 7
 *
 * @author rohan
 */
public class q7 {

    public static void main(String[] args) throws IOException {
        q3.main(args);
        data_structure a = new linked_list();
        String[] names = new String[men.size()];
        for (int i = 0; i < men.size(); i++) {
            names[i] = men.get(i).name;
        }
        a.get_girlfriend(names);
        a = new sorted_array();
        a.get_girlfriend(names);
        a = new hash_table();
        a.get_girlfriend(names);
    }
}

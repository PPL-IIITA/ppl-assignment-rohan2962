/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import Dating_world2.dating_world2;
import Dating_world2.boy;
import Dating_world2.couple;
import Dating_world2.girl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * hash table data structure
 *
 * @author rohan
 */
public class hash_table extends data_structure {

    Map<String, String> hash = new HashMap<>();

    hash_table() {
        ArrayList<couple> couples = dating_world2.couples;
        for (couple c : couples) {
            hash.put(c.guy.name, c.gal.name);
        }
    }

    @Override
    public void get_girlfriend(String[] name) {
        for (String s : name) {
            if (hash.containsKey(s)) {
                System.out.println(s + " - " + hash.get(s));
            } else {
                System.out.println(s + " - No girlfriend");
            }
        }
    }
}

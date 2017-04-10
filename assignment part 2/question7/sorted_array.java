/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import Dating_world2.dating_world2;
import Dating_world2.couple;
import Dating_world2.girl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * sorted array data structure
 *
 * @author rohan
 */
public class sorted_array extends data_structure {

    ArrayList<couple> couples_sorted = new ArrayList<>();

    sorted_array() {
        ArrayList<couple> couples = dating_world2.couples;
        couples_sorted.addAll(couples);
        Collections.sort(couples_sorted, new Comparator<couple>() {
            @Override
            public int compare(couple t, couple t1) {
                if (t.guy.name.compareTo(t1.guy.name) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });
    }

    @Override
    public void get_girlfriend(String[] name) {
        for (String s : name) {
            int low = 0, high = couples_sorted.size() - 1, mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (couples_sorted.get(mid).guy.name.compareTo(s) == 0) {
                    couples_sorted.get(mid).display();
                    break;
                } else if (couples_sorted.get(mid).guy.name.compareTo(s) < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (low > high) {
                System.out.println(s + " - No girlfriend");
            }
        }
    }
}

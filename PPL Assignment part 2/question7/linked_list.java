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

/**
 * linked list data structure
 *
 * @author rohan
 */
public class linked_list extends data_structure {

    class node {

        boy b;
        girl g;
        node next;

        node() {
            next = null;
        }
    }
    node start = null;

    linked_list() {
        ArrayList<couple> couples = dating_world2.couples;
        node t, end;
        end = start;
        for (couple c : couples) {
            t = new node();
            t.b = c.guy;
            t.g = c.gal;
            if (end == null) {
                start = end = t;
            } else {
                end.next = t;
                end = end.next;
            }

        }

    }

    @Override
    public void get_girlfriend(String[] name) {
        node end = start;
        for (String s : name) {
            end = start;
            while (end != null && end.b.name.compareTo(s) != 0) {
                end = end.next;
            }
            if (end != null) {
                System.out.println(s + " - " + end.g.name);
            } else {
                System.out.println(s + " - No girlfriend");
            }
        }
    }

}

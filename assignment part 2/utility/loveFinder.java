/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import Dating_world2.dating_world2;
import Dating_world2.boy;
import Dating_world2.girl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * find partner
 *
 * @author rohan
 */
public class loveFinder {

    /**
     * find boyfriend
     *
     * @param gal girl
     * @return boy
     */
    public boy find_match(girl gal) {
        ArrayList<boy> men = dating_world2.men;
        boy b = null;
        for (boy m : men.subList(0, men.size())) {
            if (m.budget >= gal.maintainence_cost && m.min_attraction_required <= gal.attractiveness && !m.get_relationship_status()) {
                b = m;
                break;
            }
        }
        return b;
    }

    /**
     * find boyfriend
     *
     * @param gal girl
     * @param men men to select from
     * @return boy
     */
    public boy find_match(girl gal, ArrayList<boy> men) {
        boy b = null;
        for (boy m : men.subList(0, men.size())) {
            if (m.budget >= gal.maintainence_cost && m.min_attraction_required <= gal.attractiveness && !m.get_relationship_status()) {
                b = m;
                break;
            }
        }
        return b;
    }

    /**
     * find boyfriend
     *
     * @param gal girl
     * @param m is this boy eligible?
     * @return boy
     */
    public boy find_match(girl gal, boy m) throws Exception {

        if (m.budget >= gal.maintainence_cost && m.min_attraction_required <= gal.attractiveness && !m.get_relationship_status()) {
            return m;
        }
        throw new Exception("no");
    }

    /**
     * find boyfriend
     *
     * @param gal girl
     * @param index previous boyfriend
     * @return boy
     * @throws Exception
     */
    public boy find_match(girl gal, int index) throws Exception {
        ArrayList<boy> men = dating_world2.men;
        boy b = null;
        for (boy m : men.subList(index + 1, men.size())) {
            if (m.budget >= gal.maintainence_cost && m.min_attraction_required <= gal.attractiveness && !m.get_relationship_status()) {
                b = m;
                break;
            }
        }
        if (index != 0 && b == null) {
            for (boy m : men.subList(0, index - 1)) {
                if (m.budget >= gal.maintainence_cost && m.min_attraction_required <= gal.attractiveness && !m.get_relationship_status()) {
                    b = m;
                    break;
                }
            }
        }
        if (b == null) {
            throw new Exception("no one found");
        }
        return b;
    }

    /**
     * find girlfriend
     *
     * @param guy boy
     * @return girl
     */
    public girl find_match(boy guy) {
        ArrayList<girl> women = dating_world2.women;
        girl g = null;
        for (girl w : women.subList(0, women.size())) {
            if (w.maintainence_cost <= guy.budget && w.attractiveness >= guy.min_attraction_required && !w.get_relationship_status()) {
                g = w;
                break;
            }
        }

        return g;
    }

    /**
     * find girlfriend
     *
     * @param guy boy
     * @param women select from set of women
     * @return girl
     */
    public girl find_match(boy guy, ArrayList<girl> women) {

        girl g = null;
        for (girl w : women.subList(0, women.size())) {
            if (w.maintainence_cost <= guy.budget && w.attractiveness >= guy.min_attraction_required && !w.get_relationship_status()) {
                g = w;
                break;
            }
        }

        return g;
    }

    /**
     * find girlfriend
     *
     * @param guy boy
     * @param index previous girlfriend
     * @return girl
     */
    public girl find_match(boy guy, int index) {
        ArrayList<girl> women = dating_world2.women;
        girl g = null;
        for (girl w : women.subList(index + 1, women.size())) {
            if (w.maintainence_cost <= guy.budget && w.attractiveness >= guy.min_attraction_required && !w.get_relationship_status()) {
                g = w;
                break;
            }
        }
        if (index != 0 && g == null) {
            for (girl w : women.subList(0, index - 1)) {
                if (w.maintainence_cost <= guy.budget && w.attractiveness >= guy.min_attraction_required && !w.get_relationship_status()) {
                    g = w;
                    break;
                }
            }
        }
        return g;
    }

    /**
     * find boyfriend
     *
     * @param gal girl
     * @return boy
     */
    public boy find_match1(girl gal) {
        ArrayList<boy> men = dating_world2.men;
        boy b = null;
        for (boy m : men.subList(0, men.size())) {
            if (m.budget >= gal.maintainence_cost && m.min_attraction_required <= gal.attractiveness && !m.get_relationship_status()) {
                b = m;
                break;
            }
        }
        return b;
    }

    /**
     * find girlfriend
     *
     * @param guy boy
     * @return girl
     */
    public girl find_match1(boy guy) {
        ArrayList<girl> women = dating_world2.women;
        girl g = null;
        Collections.sort(women, new Comparator<girl>() {
            @Override
            public int compare(girl t, girl t1) {
                return t.attractiveness > t1.attractiveness ? 1 : t.attractiveness < t1.attractiveness ? -1 : 0;
            }

        });
        for (girl w : women.subList(0, women.size())) {
            if (w.maintainence_cost <= guy.budget && w.attractiveness >= guy.min_attraction_required && !w.get_relationship_status()) {
                g = w;
                break;
            }
        }

        return g;
    }
}

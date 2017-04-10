/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

import java.util.ArrayList;

/**
 * Boy Details
 *
 * @author rohan
 */
public class boy {

    /**
     * name of boy
     */
    public String name;
    /**
     * attractiveness of boy
     */
    public int attractiveness;
    /**
     * minimum attractiveness required by boy
     */
    public int min_attraction_required;
    /**
     * budget of boy
     */
    public int budget;
    private final int intelligence;
    private boolean in_relationship = false;
    double happiness_level;
    /**
     * partner of boy
     */
    public girl partner;
    gift_basket gifts_bought;

    /**
     *
     * @param p girl of the boy
     */
    public void get_committed(girl p) {
        in_relationship = true;
        partner = p;
    }

    /**
     *
     * @return if he is in a relationship
     */
    public boolean get_relationship_status() {
        return in_relationship;
    }

    /**
     *
     * @param nam name
     * @param a attractiveness
     * @param m minimum attractiveness required
     * @param b budget
     * @param i intelligence
     */
    public boy(String nam, int a, int m, int b, int i) {
        name = nam;
        attractiveness = a;
        min_attraction_required = m;
        budget = b;
        intelligence = i;
    }

    /**
     * calculate happiness
     */
    public void calculate_happiness() {

    }

    /**
     * selects gifts
     */
    public void make_gift_basket() {

    }

    /**
     * selects gifts
     *
     * @param gifts set of gifts to select from
     */
    public void make_gift_basket(ArrayList<gift> gifts) {

    }

    /**
     * selects gifts
     */
    public void make_gift_basket1() {

    }

    /**
     * print name
     */
    public void display() {
        System.out.println(name);
    }

    gift_basket give_gift_basket() {
        return gifts_bought;
    }

    double get_happiness_level() {
        return happiness_level;
    }

    double get_intelligence() {
        return intelligence;
    }

}

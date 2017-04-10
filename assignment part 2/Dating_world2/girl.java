/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 * Girl Details
 *
 * @author rohan
 */
public class girl {

    public String name;
    public int attractiveness;
    public int maintainence_cost;
    private final int intelligence;
    private boolean in_relationship = false;
    public double happiness_level;
    private boy partner;
    gift_basket gifts_received;

    public void get_committed(boy p) {
        in_relationship = true;
        partner = p;
    }

    public girl(String nam, int a, int b, int i) {
        name = nam;
        attractiveness = a;
        maintainence_cost = b;
        intelligence = i;
    }

    public double get_happiness_level() {
        return happiness_level;
    }

    public double get_intelligence() {
        return intelligence;
    }

    public void display() {
        System.out.print(name);
    }

    void receive_gift_basket() {
        gifts_received = partner.give_gift_basket();
    }

    /**
     * calculates happiness
     */
    void calculate_happiness() {

    }

    public boolean get_relationship_status() {
        return in_relationship;
    }
}

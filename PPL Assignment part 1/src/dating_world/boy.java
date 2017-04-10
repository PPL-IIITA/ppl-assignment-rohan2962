/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dating_world;

import java.util.ArrayList;

/**
 *Boy Details
 * @author rohan
 */
public class boy {

    public String name;
    public int attractiveness;
    public int min_attraction_required;
    public int budget;
    private final int intelligence;
    private boolean in_relationship = false;
    private double happiness_level;
    private final int commitment_type;
    private girl partner;
    private gift_basket gifts_bought;

    public void get_committed(girl p) {
        in_relationship = true;
        partner = p;
    }

    public boolean get_relationship_status() {
        return in_relationship;
    }

    public boy(String nam, int a, int m, int b, int i, int c) {
        name = nam;
        attractiveness = a;
        min_attraction_required=m;
        budget = b;
        intelligence = i;
        commitment_type = c;
    }

    public void calculate_happiness() {
        switch (commitment_type) {
            case 1:
                happiness_level = budget - gifts_bought.cost;
                break;
            case 2:
                happiness_level = partner.get_happiness_level();
                break;
            default:
                happiness_level = partner.get_intelligence();
                break;
        }
    }

    public void display() {
        System.out.println(name);
    }

    public void make_gift_basket() {
        ArrayList<gift> gifts = dating_world.gifts;
        gifts_bought = new gift_basket();
        double money_to_spend;
        if (commitment_type == 1 || commitment_type == 3) {
            money_to_spend = partner.maintainence_cost;
            for (gift g : gifts) {
                if (money_to_spend > 0) {
                    gifts_bought.add(g);
                    gifts_bought.cost += g.price;
                    gifts_bought.total_value += g.value;
                    if (g.type == 2) {
                        gifts_bought.luxury_value += g.value;
                    }
                }
            }
        } else if (commitment_type == 2) {
            money_to_spend = budget;
            for (gift g : gifts) {
                if (money_to_spend >= g.price) {
                    gifts_bought.add(g);
                    gifts_bought.cost += g.price;
                    gifts_bought.total_value += g.value;
                    if (g.type == 2) {
                        gifts_bought.luxury_value += g.value;
                    }
                }
            }
        }

    }

    public gift_basket give_gift_basket() {
        return gifts_bought;
    }

    public double get_happiness_level() {
        return happiness_level;
    }

    public double get_intelligence() {
        return intelligence;
    }
    public double get_gift_val()
    {
        return gifts_bought.cost;
    }

}

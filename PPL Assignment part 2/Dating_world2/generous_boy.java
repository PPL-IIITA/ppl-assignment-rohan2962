/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

import java.util.ArrayList;

/**
 * generous boy
 *
 * @author rohan
 */
public class generous_boy extends boy {

    /**
     *
     * @param nam name
     * @param a attractiveness
     * @param m minimum attractiveness required
     * @param b budget
     * @param i intelligence
     */
    public generous_boy(String nam, int a, int m, int b, int i) {
        super(nam, a, m, b, i);
    }

    /**
     * calculates happiness
     */
    @Override
    public void calculate_happiness() {
        happiness_level = partner.get_happiness_level();
    }

    /**
     * selects gifts
     */
    @Override
    public void make_gift_basket() {
        ArrayList<gift> gifts = dating_world2.gifts;
        gifts_bought = new gift_basket();
        double money_to_spend;
        money_to_spend = budget;
        for (gift g : gifts) {
            if (money_to_spend >= g.price) {
                gifts_bought.add(g);
                gifts_bought.cost += g.price;
                gifts_bought.total_value += g.value;
                gifts_bought.luxury_value += g.value;

            }
        }
    }

    /**
     * selects gifts
     */
    @Override
    public void make_gift_basket(ArrayList<gift> gifts) {

        gifts_bought = new gift_basket();
        double money_to_spend;
        money_to_spend = budget;
        for (gift g : gifts) {
            if (money_to_spend >= g.price) {
                gifts_bought.add(g);
                gifts_bought.cost += g.price;
                gifts_bought.total_value += g.value;
                gifts_bought.luxury_value += g.value;

            }
        }
    }

    /**
     * selects gifts
     */
    @Override
    public void make_gift_basket1() {
        ArrayList<gift> gifts = dating_world2.gifts;
        gifts_bought = new gift_basket();
        boolean e = true, u = true, l = true;
        int ei = 0, ui = 0, li = 0;
        double money_spent = 0;
        for (gift g : gifts) {

            if (g.gettype() == "essential_gift" && e) {
                e = false;
                gifts_bought.add(g);
                ei = gifts.indexOf(g);
                money_spent += g.price;
            }
            if (g.gettype() == "luxury_gift" && l) {
                l = false;
                li = gifts.indexOf(g);
                gifts_bought.add(g);
                money_spent += g.price;

            }
            if (g.gettype() == "utility_gift" && u) {
                u = false;
                gifts_bought.add(g);
                ui = gifts.indexOf(g);
                money_spent += g.price;
            }
            if (!e && !u && !l) {
                break;
            }
        }
        double money_to_spend;
        money_to_spend = budget - money_spent;
        for (gift g : gifts) {
            if (money_to_spend >= g.price && gifts.indexOf(g) != li && gifts.indexOf(g) != ei && gifts.indexOf(g) != ui) {
                gifts_bought.add(g);
                gifts_bought.cost += g.price;
                gifts_bought.total_value += g.value;
                gifts_bought.luxury_value += g.value;

            }
        }
    }
}

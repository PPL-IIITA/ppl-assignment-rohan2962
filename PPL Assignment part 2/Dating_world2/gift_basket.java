/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

import java.util.ArrayList;

/**
 * details of gift basket
 *
 * @author rohan
 */
class gift_basket {

    public ArrayList<gift> basket;
    public double cost;
    public double luxury_value;
    public double total_value;

    /**
     * add to gift basket
     *
     * @param g add gift to gift basket
     */
    public void add(gift g) {
        basket.add(g);
    }

    gift_basket() {
        basket = new ArrayList<>();
        cost = 0;
        luxury_value = 0;
        total_value = 0;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 * girl who is choosy
 * @author rohan
 */
public class choosy_girl extends girl {

    /**
     *
     * @param nam name of the girl
     * @param a attractiveness
     * @param b maintenance cost
     * @param i intelligence level
     */
    public choosy_girl(String nam, int a, int b, int i) {
        super(nam, a, b, i);
    }

    @Override
    void calculate_happiness() {

        happiness_level = Math.abs(Math.log(gifts_received.cost - maintainence_cost + 2 * gifts_received.luxury_value));

    }
}

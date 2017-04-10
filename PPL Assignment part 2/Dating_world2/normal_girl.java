/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 * normal girl
 * @author rohan
 */
public class normal_girl extends girl {

    /**
     *
     * @param nam name
     * @param a attractiveness
     * @param b maintenance cost
     * @param i intelligence
     */
    public normal_girl(String nam, int a, int b, int i) {
        super(nam, a, b, i);
    }

    /**
     * calculates happiness
     */
    @Override
    void calculate_happiness() {
        happiness_level = Math.abs(gifts_received.cost - maintainence_cost + gifts_received.total_value);
    }
}

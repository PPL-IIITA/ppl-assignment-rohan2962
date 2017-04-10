/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import Dating_world2.couple;

/**
 * calculate happiness and compatibility
 *
 * @author rohan
 */
public class relationship_parameters_calculation {

    /**
     * calculate happiness
     *
     * @param c couple
     * @return
     */
    public double happiness_calculator(couple c) {
        c.calculate_happiness();
        return c.happiness;
    }

    /**
     * calculate compatibility
     *
     * @param c couple
     * @return
     */
    public double compatibility_calculator(couple c) {
        c.calculate_compatibility();
        return c.compatibility;
    }
}

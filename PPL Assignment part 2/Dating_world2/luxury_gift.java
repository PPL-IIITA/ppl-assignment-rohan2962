/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 *luxury gift
 * @author rohan
 */
public class luxury_gift extends gift {

    public double luxury_rating;
    public double difficulty_to_obtain;

    /**
     *
     * @param p price
     * @param v value
     */
    public luxury_gift(double p, double v) {
        super(p, v);
    }

    /**
     *
     * @return gift type
     */
    @Override
    public String gettype() {
        return "luxury_gift";
    }
}

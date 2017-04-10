/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 *utility gift
 * @author rohan
 */
public class utility_gift extends gift {

    public double utility_class, utiliy_value;

    /**
     *
     * @param p price
     * @param v value
     */
    public utility_gift(double p, double v) {
        super(p, v);
    }

    /**
     *
     * @return gift type
     */
    @Override
    public String gettype() {
        return "utility_gift";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 * essential gift
 *
 * @author rohan
 */
public class essential_gift extends gift {

    /**
     *
     * @param p price
     * @param v value
     */
    public essential_gift(double p, double v) {
        super(p, v);
    }

    /**
     *
     * @return gift type
     */
    @Override
    public String gettype() {
        return "essential_gift";
    }
}

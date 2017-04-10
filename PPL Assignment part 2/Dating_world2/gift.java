/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

/**
 * Gift Details
 *
 * @author rohan
 */
public class gift {

    /**
     * price of gift
     */
    public double price;
    /**
     * value of gifts
     */
    public double value;

    /**
     *
     * @param p price
     * @param v value
     */
    public gift(double p, double v) {
        price = p;
        value = v;
    }

    /**
     *
     * @return gift type
     */
    public String gettype() {
        return "gift";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dating_world2;

import java.util.ArrayList;

/**
 * couple details
 *
 * @author rohan
 */
public class couple {

    /**
     * girl in the couple
     */
    public girl gal;
    /**
     * boy in the couple
     */
    public boy guy;
    /**
     * couples happiness
     */
    public double happiness;
    /**
     * couples compatibility
     */
    public double compatibility;

    /**
     * print details
     */
    public void display() {
        gal.display();
        System.out.print(" and ");
        guy.display();
    }

    /**
     * print happiness
     */
    public void display_happiness() {
        System.out.print(happiness + " ");
        display();
    }

    /**
     * print compatibility
     */
    public void display_compatibility() {
        System.out.print(compatibility + " ");
        display();
    }

    /**
     * give gifts
     */
    public void give_gifts() {
        guy.make_gift_basket();
        gal.receive_gift_basket();
    }

    /**
     * give gifts
     *
     * @param gifts select from a set of gifts
     */
    public void give_gifts(ArrayList<gift> gifts) {
        guy.make_gift_basket(gifts);
        gal.receive_gift_basket();
    }

    /**
     * give gifts
     */
    public void give_gifts1() {
        guy.make_gift_basket1();
        gal.receive_gift_basket();
    }

    /**
     * calculate their happiness
     */
    public void calculate_happiness() {
        guy.calculate_happiness();
        gal.calculate_happiness();
        happiness = guy.get_happiness_level() + gal.get_happiness_level();
    }

    /**
     *
     * @param g girl in the couple
     * @param b boy in the couple
     */
    public couple(girl g, boy b) {
        gal = g;
        guy = b;
    }

    /**
     * calculate their compatibility
     */
    public void calculate_compatibility() {
        compatibility = Math.abs(guy.budget - gal.maintainence_cost);
        compatibility += Math.abs(guy.attractiveness - gal.attractiveness);
        compatibility += Math.abs(guy.get_intelligence() - gal.get_intelligence());
    }

}

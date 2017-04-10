/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dating_world;

/**
 *Couple Details
 * @author rohan
 */
public class couple {
    public girl gal;
    public boy guy;
    public double happiness;
    public double compatibility;
    public void display() {
        gal.display();
        System.out.print(" and ");
        guy.display();
    }

    public void give_gifts() {
        guy.make_gift_basket();
        gal.receive_gift_basket();
    }

    public void calculate_happiness() {
        guy.calculate_happiness();
        gal.calculate_happiness();
        happiness=guy.get_happiness_level()+gal.get_happiness_level();
    }
    public couple(girl g,boy b)
    {
        gal=g;
        guy=b;
    }

    public void calculate_compatibility() {
         compatibility=guy.budget-gal.maintainence_cost;
         compatibility+=Math.abs(guy.attractiveness-gal.attractiveness);
         compatibility+=Math.abs(guy.get_intelligence()-gal.get_intelligence());
    }
}

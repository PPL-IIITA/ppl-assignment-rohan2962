/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dating_world;

/**
 *Girl Details
 * @author rohan
 */
public class girl {
    public String name;
    public int attractiveness;
    public int maintainence_cost;
    private final int intelligence;
    private boolean in_relationship=false;
    private double happiness_level;
    private final int commitment_type;
    private boy partner;
    private gift_basket gifts_received;
    public void get_committed(boy p) {
        in_relationship = true;
        partner = p;
    }

    public girl(String nam, int a,int b,int i,int c) {
        name = nam;
        attractiveness = a;
        maintainence_cost = b;
        intelligence = i;
        commitment_type = c;
    }
    public void calculate_happiness()
    {
        switch (commitment_type) {
            case 1:
                happiness_level=Math.log(gifts_received.cost-maintainence_cost+2*gifts_received.luxury_value);
                break;
            case 2:
                happiness_level=gifts_received.cost-maintainence_cost+gifts_received.total_value;
                break;
            default:
                happiness_level=Math.exp(gifts_received.cost-maintainence_cost);
                break;
        }
    }
    public double get_happiness_level()
    {
        return happiness_level;
    }
    public double get_intelligence()
    {
        return intelligence;
    }

    public void display() {
        System.out.print(name);
    }

    public void receive_gift_basket() {
        gifts_received=partner.give_gift_basket();
    }
}

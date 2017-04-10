/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import dating_world.couple;
import dating_world.dating_world;
import utility.loveFinder;
import java.io.IOException;

/**
 *Question 1 executable
 * @author rohan
 */
public class q1 {
    public static void main(String[] args) throws IOException {
        dating_world.getdata();
        loveFinder l = new loveFinder();
        l.make_match();
        for(couple c: dating_world.couples)
        {
            c.display();
        }
    }
}

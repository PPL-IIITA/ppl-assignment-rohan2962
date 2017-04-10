/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import dating_world.couple;
import dating_world.dating_world;
import java.util.ArrayList;

/**
 *
 * @author rohan
 */
public class relationship_parameters_Calculation {
    public void calculator()
    {
         ArrayList <couple> couples = dating_world.couples;
         for(couple c : couples)
         {
             c.calculate_happiness();
             c.calculate_compatibility();
         }
    }
}

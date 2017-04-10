/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dating_world;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import question1.q1;
import question2.q2;
import utility.test_case_generator;

/**
 *Gets input
 * @author rohan
 */
public class dating_world {

    /**
     */
    public static ArrayList<girl> women = new ArrayList<>();
    public static ArrayList<boy> men = new ArrayList<>();
    public static ArrayList<couple> couples = new ArrayList<>();
    public static ArrayList<gift> gifts = new ArrayList<>();

    public static void getdata() throws FileNotFoundException, IOException {
        FileReader fr;
        BufferedReader br;
        int n, i;
        int a, m, bu, in, co;
        String name;
        boy b;
        girl g;
        gift gi;
        fr = new FileReader("boy_data");
        br = new BufferedReader(fr);
        n = br.read();
        br.readLine();
        for (i = 0; i < n; i++) {
            name = br.readLine();
            a = br.read();
            br.readLine();
            m = br.read();
            br.readLine();
            bu = br.read();
            br.readLine();
            in = br.read();
            br.readLine();
            co = br.read();
            br.readLine();
            b = new boy(name, a, m, bu, in, co);
            men.add(b);
        }
        fr.close();
        br.close();
        fr = new FileReader("girl_data");
        br = new BufferedReader(fr);
        n = br.read();
        br.readLine();
        for (i = 0; i < n; i++) {
            name = br.readLine();
            a = br.read();
            br.readLine();
            bu = br.read();
            br.readLine();
            in = br.read();
            br.readLine();
            co = br.read();
            br.readLine();
            g = new girl(name, a, bu, in, co);
            women.add(g);
        }
        fr.close();
        br.close();
        fr = new FileReader("gift_data");
        br = new BufferedReader(fr);
        n = br.read();
        for (i = 0; i < n; i++) {

            a = br.read();
            m = br.read();
            co = br.read();
            gi = new gift(a, m, co);
            gifts.add(gi);
        }
        fr.close();
        br.close();
    }

    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do
        {
            System.out.println("Enter Choice\n1: Question 1\n2: Question 2\n3: Test case generation\n4: Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:q1.main(args);break;
                case 2:q2.main(args);break;
                case 3:test_case_generator.main(args);break;
                default: break;
            }
        }while(choice!=4);
    }
}

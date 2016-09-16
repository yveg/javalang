/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Collections {

    public static void main(String[] args) {
        /*memo
        ArrayList<String> liste = new  ArrayList<String>();
        liste.add("coucou");
        liste.add("hello");
        
        //ou bien System.out.println(liste+" "+liste.size());
        for (String s : liste) {
            System.out.println(s);
        }
        
        liste.remove("coucou");// avec parametre obligatoire
        //liste.clear sans parametre efface tout et met a zero.
        System.out.println(liste+" "+liste.size());
        System.out.println(liste.indexOf("coucou"));
        
        System.out.println(liste.get(2));
         */
        ArrayList<Integer> liste1 = new ArrayList<Integer>(); //liste = {10,20,30,40,50,60,70,80,90};
        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        ArrayList<Integer> liste3 = new ArrayList<Integer>();
        // debut code test
        int b, n, c = 0; 
        String nom="liste";
        
        while (c <= 2) {
            if (c == 0) {
                b = 10;
                n = 1;
            }
            if (c == 1) {
                b = 2;
                n = 2;
            }
            if (c == 2) {
                b = 3;
                n = 3;
            }
            for (int a = 0; a <= 100; a = a + b) {
               nom=nom+n;
                nom.add(a);
            }
            c++;
        }
        //fin code test

        for (int a = 0; a <= 100; a = a + 10) {
            liste1.add(a);
        }
        for (int a = 0; a <= 100; a = a + 2) {
            liste2.add(a);
        }
        for (int a = 0; a < 100; a = a + 3) {
            liste3.add(a);
        }
        System.out.print(liste1 + "\n" + liste2 + "\n" + liste3 + "\n");
        System.out.println("liste1: " + liste1.size());
        System.out.println("liste2: " + liste2.size());
        System.out.println("liste3: " + liste3.size());

        liste2.removeAll(liste1);
        liste2.removeAll(liste3);
        System.out.println("liste2: " + liste2);

    }

}

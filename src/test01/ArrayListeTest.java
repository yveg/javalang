/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author admin
 */
public class ArrayListeTest {
    public static void main(String[] args) {
        ArrayList<String> liste0 = new ArrayList<>();
        ArrayList<String> liste1 = new ArrayList<>();
        
        
        
        liste0.add("Thomas");
        liste0.add("Jerome");
        liste0.add("Amaury");
        liste0.add("Myrtha");
        
        liste1.add("Edouard");
        liste1.add("Maxime");
        
        liste1.addAll(liste0);
        System.out.println("liste1: "+liste1);
        
        ArrayList listemixte = new ArrayList();
        /*Random r;
        r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        */
        
        listemixte.add("d");
        listemixte.add("y");
        listemixte.add("a");
        listemixte.add(1);
        listemixte.add(true);
        listemixte.add("coucou");
        listemixte.add(4);
        listemixte.add(5);
        listemixte.add(6);
        
        /*ArrayList<String> nombre = new ArrayList<>();
        char z;
        for (int a = 0; a < 10; a++) {
             z = (char)(a + '0');
                nombre.add(z);
            }
*/
        //liste de nb
        ArrayList<Integer> nombre = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
                nombre.add(a);
            }
        //suppression
        listemixte.removeAll(nombre);
        System.out.println("listmiste: "+listemixte);
    } 
    
}

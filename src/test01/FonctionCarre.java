/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.io.DataInputStream;
import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class FonctionCarre {
    
     
    public static void main(String[] args) throws IOException { 
        String txt = ConsoleUtil.liretext("entrer un nb entier");
        System.out.println(txt);
        int nombre =Integer.valueOf(txt); //conversion text vers int
        int nombrecarre = MathUtil.carre(nombre);
        System.out.println("le carré de " + nombre+ " est " +nombrecarre);
        
        
    }
    
}

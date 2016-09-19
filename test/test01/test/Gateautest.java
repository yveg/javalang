/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01.test;

import org.junit.Test;
import static org.junit.Assert.*;
import test1.classes.Gateau;

/**
 *
 * @author admin
 */
public class Gateautest {
    
    @Test
    public void test00() {
          Gateau g1 =new Gateau();
          g1.setGout("fraise");
          //g1.setForme("ronde");
          g1.setCouleur("rose");
          
       
        
        Gateau g2 =new Gateau();
        g2.setGout("chocolat");
        //g2.setForme("ovale");
        g2.setCouleur("noir");
        
        Gateau g3 =new Gateau();
          g3.setGout("poire");
          //g3.setForme("carre");
          g3.setCouleur("vert");
        
          Gateau.setForme("ovoide");
          
        //System.out.println(f1.getTitre());
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
    
}

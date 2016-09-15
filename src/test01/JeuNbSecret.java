/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.awt.Window;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;
//import static test1.util.MathUtil.factoriel;

/**
 *
 * @author admin
 */
public class JeuNbSecret {

    public static void main(String[] args) throws IOException {
        //demande un  min et max par utilisateur
        int min,max;
        String prise = ConsoleUtil.liretext("demande  min");
        min = Integer.valueOf(prise);
        prise = ConsoleUtil.liretext("demande  max");
        max = Integer.valueOf(prise);
        System.out.println("fin des saisies");
        //generer un nb aleatoire en fonction du min et max
        int ab= MathUtil.lancerdes(min,max);
        System.out.println(ab);
        // int saisie, start=0; 
        
        /*double nbsecretdec = Math.random()*100+1;
        int nbsecret = (int) nbsecretdec; // conversion dec vers int
        System.out.println(nbsecret);
         */
        int a = MathUtil.lancerdes();
        System.out.println(a);

        System.out.println("test de saisie et evaluation");
        int nbsecret = MathUtil.lancerdes();
        /* code avec du simple if else if 
       String essaistr =ConsoleUtil.liretext("votre essai");
       int saisie =  Integer.valueOf(essaistr);
       
     
        
       if (nbsecret==saisie) {
           System.out.println("Gagné");
           return;
       }
       else {
           System.out.println("Perdu");
           if (nbsecret>saisie) {
               System.out.println("nb secret>saisie");
               return;
           }
           else {
               System.out.println("nb secret<saisie");
               return;
           }
           //return;
       }
         */ int saisie, start=0;
        do {
            String essaistr = ConsoleUtil.liretext("votre essai");
            saisie = Integer.valueOf(essaistr);
            start++;
            if (nbsecret > saisie) {
                System.out.println("plus grand");//a remplir
            } else if (nbsecret < saisie) {
                System.out.println("Plus petit");
            }
        } while (nbsecret != saisie); 
        String appreciation="";
        //System.out.println("Gagné avec " +start+ " coups");
        /*switch (start) {
            default:System.out.println("Gagné avec " +start+ " coups");break;
            case 3:System.out.println("Genial, gagné avec " +start+ " coups");break;
            case 6:System.out.println("Super, Gagné avec " +start+ " coups");break;
            case 9:System.out.println("Cool, Gagné avec " +start+ " coups");break;
            case 12:System.out.println("Pas mal, Gagné avec " +start+ " coups");break;
        }*/
        if (start<3) {appreciation="Genial"; 
        }
        else if (start<6) {appreciation="Super"; }
        else if (start<9) {appreciation="Cool"; }
        else if (start<12) {appreciation="Pas Mal"; }
        System.out.println(appreciation+" ,Gagné avec " +start+ " coups");

        /* int b = ConsoleUtil.saisir();
       System.out.println(b);
         */
        
        int ml=MathUtil.factoriel(5);
        System.out.println("factoriel de 5 :" +ml);
        

    }

}

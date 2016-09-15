/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static int carre(int n) throws IOException {
        int c = n * n;
        return c;
    }
/**
 * genere un nombre aleatoire entre 1 et 100
 * @return
 * @throws IOException 
 */
    public static int lancerdes() throws IOException {
        double nbsecretdec = Math.random() * 100 + 1;
        int c = (int) nbsecretdec;
        return c;
        //(ERROR);
    }

    public static int lancerdes(int min, int max) throws IOException {
        //code boucle lourd
        /*if (min >= max) {
            throw new RuntimeException("min plus grand que max");
        }
        int de;
        do {
            de = (int) Math.random() * max;
            de = (int) de;
        } while (de < min);
        return de;
        */
         //code alternatif avec une intervalle
         if (min >= max) {
            throw new RuntimeException("min plus grand que max");
        }
        int res= min+ (int)(Math.random() * (max-min+1));
        return res;
        
        
        /* code recursif
         if (min >= max) {
            throw new RuntimeException("min plus grand que max");
        }
        int nb =(int) (Math.random()*max);
        if (nb<=max && nb>=min)
        return nb;
        return lancerdes(min,max);
        */
        
        
    }
    
    

    public static int exposant(int nombre, int puissance) {
        if (puissance <= 0) {
            return 1;
        }
        int result = nombre;
        while (puissance > 1) {
            result = result * nombre;
            puissance--;
        }
        return result;

        /*int result;
        for (int i=0 ; i<puissance ; i++) {
            result=nombre;
            result=result*nombre;
    // instructions à exécuter */
    }

    public static int factoriel(int nb) {
        if (nb < 0) {
            throw new RuntimeException("erreur mathematique");
        }
        int rez = nb;
        while (nb > 1) {
            rez = rez * (nb - 1);
            nb--;
        }
        return rez;

        /*
        int resol=0;
        if (nb<0) {System.out.println("erreur: nb negatif");
        return 1;            
        }
        while (nb!=0){
        resol=nb * (nb-1);
        nb=nb-1;
        }
        return resol;
        //System.out.println("resultat: "+resol);
        
        for (int resol=0;nb!=0;i--) {
        resol=nb * (nb-1);
        nb=nb-1;
        }
         */
    }

    public static int factorielrecursif(int nb) {
        if (nb < 0) {
            throw new RuntimeException("erreur mathematiqu");
        }
        if (nb <= 1) {
            return 1;
        }
        return nb * factorielrecursif(nb - 1);
    }
}

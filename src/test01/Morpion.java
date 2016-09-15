/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.io.IOException;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class Morpion {
    //fonction affiche tab
        public static void affiche(int [][] p) {
            for (int[] ligne :p) {
                for (int elem :ligne) {
                    System.out.print("cadre["+ligne+"]["+p+"] contient:"+elem +"\n");
                }
            }
            
        }

    public static void main(String[] args) throws IOException {
        //DECLARATION
        int taille=3;
        int[][] cadre = new int[taille][taille];

        //INIT
        for (int a = 0; a < cadre.length; a++) {
            for (int b = 0; b < cadre[a].length; b++) {
                cadre[a][b] =  MathUtil.lancerdes(0, 1);
            }

        }
        //affichage
        for (int a = 0; a < cadre.length; a++) {
            for (int b = 0; b< cadre[a].length; b++) {
                System.out.print("cadre["+a+"]["+b+"] contient:"+cadre[a][b] +"\n");
            }
        }
        /* affichage alternatif
        for (int[] soutab : cadre) {
	for (int elem : soutab) {
		System.out.println("cadre["+soutab+"][]: "+elem);
	}
}*/
        System.out.println("tableau");
        affiche(cadre);

    }

}

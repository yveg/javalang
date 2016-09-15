/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

/**
 *
 * @author admin
 */
public class ForeachTableau {
    public static void main(String[] args) {
        //declaration
        int[] tab=new int[10];
        tab[0]=123;
        int [][] plateau = new int [3] [3];
        //init
        for (int i=0;i<tab.length;i++){
            tab[i] =i+1;
        }
        //affichage
        for (int valact :tab) {
            System.out.println("tab[?] vaut: "+ valact);
        }
    }
    
}

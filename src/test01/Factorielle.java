/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class Factorielle {
    public static void main(String[] args) {
        int n=3;
        int res = MathUtil.factoriel(n);
        System.out.println("Factorielle de "+n+" vaut: "+res);
        System.out.format("Factorielle de %d vaut %d\n",n ,res);
    }
    
}

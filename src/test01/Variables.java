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
public class Variables {
    public static void main(String[] args) {
        //type primitif entier
        byte bote=99;
        short court=9999;
        long lon=999999999;
        
        //type primitif decimaux
        float deci = (float) 123.25; // equivaut a float deci = 123.25f;
        double decgrand = 12365822.365; 
        
        Byte b1 = new Byte("12");
        
        //type boolean
        boolean boule=true; //ou false
        
        //chaine de caractere
        String text="blabla"; // majuscule importante
        
        //conversion ou cast
        String s=Long.toString(123);
        
        Long l=new Long(123);
        String s2=l.toString();
        
        long l321=Long.valueOf("1234");
        
        //exo
        int entier1, entier2; //int entier1=123, entier2=456;
        entier1=123;entier2=456;
        int resultat = entier1 +entier2;
        char rez; //un seul caractere.
        String j = new String();
        j = j.valueOf(resultat);
        rez =(char)resultat;
        System.out.println("resultat en calcul int: " + (entier1 + entier2));
        System.out.println("Le résultat en var int est  " + resultat);
        System.out.println("Le résultat en string est " + j);
        System.out.println("Le résultat en char est " + rez);
    }
    
}

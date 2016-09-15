/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;
/**
 *
 * @author admin
 */
public class exo {
    
   public static void main(String[] args) { 
   int nb = 123; //affecte en nombre
   String lettre= new String();
   lettre = lettre.valueOf(nb);
   //String s=long.toString(nb);
   Long lettre2= Long.valueOf(lettre);
   lettre2= lettre2+100;
   String lettre3= new String();
   lettre3= Long.toString(lettre2);
   System.out.println(lettre3);
   
   Integer i = new Integer(123); // ou int i = 123;
   String s=i.toString(); // conversion de int vers string
   Long l= new Long(s); // ou Long l = Long.valueOf(s); conversion string ver long
   l =l+100; // ajout de 1000
    //? conversion de long vers string
   System.out.println("resultat: " +s);
   
//saisie   
   Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir une valeur  :");
String srt = sc.nextLine();
System.out.println("Vous avez saisi : " + srt);
int valeur =Integer.valueOf(srt);
   /*int a;
   a= srt;
 */
   switch (valeur)
 {
     case 4:
         System.out.println("correspondant a 4 ");// instructions à exécuter
         break;
     case 5:
         System.out.println("correspondant a 5 "); // instructions à exécuter
         break;
     // ...
     default:
         System.out.println("correspondant a  defaut ");// instructions à exécuter
         break;
 }
    System.out.println("fin du code ");
   }
    
}

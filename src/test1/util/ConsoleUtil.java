/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ConsoleUtil {
    
    /*pas bon
    public static int lireint(String message) throws IOException {
        DataInputStream clavier =new DataInputStream(System.in);
        System.out.println(message);
        return clavier.readInt();
    }
    */
    public static int lireint(String message) throws IOException {
        String txt= liretext(message);
        return Integer.valueOf(txt);
    }

    public static String liretext(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.println(message);
        String text = clavier.readLine();
        return text;
    }
    
 /*      public static String saisir() throws IOException {
            Scanner sc = new Scanner(System.in);
        
System.out.println("Veuillez saisir une valeur  :");
String srt = sc.nextLine();
System.out.println("Vous avez saisi : " + srt);
int valeur = Integer.valueOf(srt);
return valeur;
       }
*/    
 
    
}

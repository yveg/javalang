/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author admin
 */
public class SetTest {
     public static void main(String[] args) {
         HashSet<String> set = new HashSet<>();
         set.add("thomas");
         set.add("diga");
         set.add("thomas");
         
         System.out.println("hashset "+set);
         
     
     HashSet<Integer> pak = new HashSet<>();
      pak.add(1);
      pak.add(2);
      pak.add(3);
      System.out.println("avant set pak: " +pak);
      
      ArrayList<Integer> nombre = new ArrayList<>(); // Collection<Integer> nombre = new ArrayList<>(); possible aussi
      nombre.add(1); nombre.add(2); nombre.add(3); nombre.add(4); nombre.add(5); nombre.add(6);
       nombre.add(1); nombre.add(2); nombre.add(3); nombre.add(4); nombre.add(5); nombre.add(6);
       System.out.print("avant liste nombre: " +nombre+"\n\n");
       
       //ajouter set pak dans la liste nombre
       nombre.addAll(pak);
       
       //ajouter liste nombre dans le set pack
      // pak.addAll(nombre);
         System.out.println("apres set pak: " +pak);
         System.out.println("apres liste nombre: " +nombre);
    }
}

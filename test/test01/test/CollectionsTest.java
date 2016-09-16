/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01.test;

import java.util.HashMap;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CollectionsTest {

    
    public void fonction() {
        //exemple avec Junit framework java
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");

        map.size(); //renvoie 3
        map.get("ruby");//renvoie "langage de script objet"
        map.keySet(); //renvoie un set dans java,c,ruby
        map.values(); //renvoie toutes les valeurs, pas les clés
        map.putAll(map); //ajoute une map dans une autre
        map.remove("c"); //supprime l'entree c dans la map
        map.replace("c", "langage prehistorique"); //remplace a la cle c par le contenu langage...4
        map.clear(); //vide la map

//exo
    }
    
    @Test
    public void fcgetruby(String cle, String nomdemap) {
     //creer une fonction de test  get ruby qui recupere la definition de cle ruby
     HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");
        
        String def =map.get("ruby");
        System.out.println(def); // ou System.out.println(map.get("ruby");)
    }
//fonction remplace ruby par super langage
    @Test
    public void remplacetestrubysuperlang(String cle, String nomdemap) {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");
        
        map.replace("ruby", "super langage");
    }
    //fonction supprime langage c
    @Test
    public void delangagec(String cle, String nomdemap) {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");
        
        map.remove("c");
    }
    //creer une 2eme map et la fusionne a la premiere
    @Test
    public void fusion() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");
        
        HashMap<String, String> map2 = new HashMap<>();
        fonction();
        map2.put("Php", "langage de programmation web");
        map2.put("Python", "langage de programmation unix");
        map.putAll(map2);
        System.out.println(map);
        }
    
    //recuperer les cles puis afficher la correspondance avec une boucle
    @Test
            public void iteresurcle() {
    HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");
        Set<String> keyset=map.keySet(); 
        System.out.println("les cles sont: " + keyset );
        
        //affiche les valeurs correspondantes a chaque cles
        for (String key :keyset){
            System.out.println(key+" : "+map.get(key) );
            
        }
         
            }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author admin
 */
public class Brouillon {

    public static void main(String[] args) {

        //automatiser ou concatener des noms de variable qui seront triter avec une fonction style: variable.fonction
        String nom = "liste";
        int n = 2;
        nom = nom + n;
        System.out.println("nom apparait comme: " + nom);

        //generer des lettres aleatoirement
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');

        //hashset
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");
        Set<String> keyset = map.keySet();
        System.out.println("Key set values are: " + keyset);

        //affiche les valeurs correspondantes a chaque cles
        for (String key : keyset) {
            System.out.println(key + " : " + map.get(key));

        }

    }
}

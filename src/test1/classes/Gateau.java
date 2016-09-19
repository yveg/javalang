/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Gateau {

    public static String getForme() {
        return forme;
    }

    public static void setForme(String forme) {
        Gateau.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }
    private static String forme;
    private  String gout;
     private  String couleur;

    public Gateau() {
        this.couleur ="noir";
        this.gout ="chocolat";
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    
    
  @Override 
     public String toString() {
        return "forme: "+forme+" au gout de:" +gout+" de couleur: "+couleur; //To change body of generated methods, choose Tools | Templates.
    }
    
}

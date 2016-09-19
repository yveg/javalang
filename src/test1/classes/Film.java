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
public class Film {
    //private String titre;
    public static String titre;
    private Integer duree;
    private String synopsis;
    private Integer annee;

    /*@Override
    public String toString() {
        return "film: "+titre+" " +duree+" " +synopsis+" " +annee; //To change body of generated methods, choose Tools | Templates.
    }*/
    @Override 
     public String toString() {
        return "film: "+titre+" " +duree+" " +synopsis+" "; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    

   
    
}

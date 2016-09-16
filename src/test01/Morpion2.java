/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class Morpion2 {

    int ligne, partie = 0, colonne, joueur = 0;
    //DECLARATION
    int taille = 3;
    //nouvelle partie
    char[][] cadre = new char[taille][taille];
    //INIT tableau

    public void resett() {
        for (int a = 0; a < cadre.length; a++) {
            for (int b = 0; b < cadre[a].length; b++) {
                cadre[a][b] = 'v';
            }
        }
    }

    //fonction affiche tab
    public void affiche(char[][] p) {
        for (int a = 0; a < cadre.length; a++) {
            for (int b = 0; b < cadre[a].length; b++) {
                System.out.print("cadre[" + a + "][" + b + "] contient:" + cadre[a][b] + "\n");
                //System.out.println(cadre[a][b]);
            }
        }

    }

    public void tomar() throws IOException {
        System.out.println("Tour du joueur: " + joueur);
        ligne = ConsoleUtil.lireint("demande la ligne");
        colonne = ConsoleUtil.lireint("demande de la colonne");
        System.out.println("fin des saisies");
    }

    public void verifsaisie() throws IOException {
        System.out.println("verif si vide");
        char elem = cadre[ligne][colonne];
        if (elem == 'x' || elem == 'o') {
            System.out.println("case occupée");
            tomar();
        } else if (joueur == 0) {
            cadre[ligne][colonne] = 'x';
            joueur = 1;
        } else {
            cadre[ligne][colonne] = 'o';
            joueur = 0;
        }
    }
//verif bonne entree de valeur dans la saisie
    public void verifss() throws IOException {
        //boolean placementok = false;
        boolean sortieboucle = true;
        do {
             ligne = ConsoleUtil.lireint("joueur" + joueur + "entrez ligne");
            colonne = ConsoleUtil.lireint("joueur" + joueur + "entrez colonne");
            if (ligne < 0 || ligne > 2 || colonne < 0 || colonne > 2) {
                System.out.println("coord hors plateau");
                sortieboucle = false; //continue;
            }
            if (cadre[ligne][colonne] != 'v') {
                System.out.println("case occupee");
                sortieboucle = false; //continue;
            }
        } while (sortieboucle != false);
        if (joueur == 0) {
            cadre[ligne][colonne] = 'x';
            joueur = 1;
        } else {
            cadre[ligne][colonne] = 'o';
            joueur = 0;
        }
    }

    public void verifgagne() throws IOException {
        //verifier que les 3 cases sont egales a x ou o.
        affiche(cadre);
        if (cadre[0][0] == cadre[0][1] && cadre[0][1] == cadre[0][2] && cadre[0][1] == cadre[0][0] && cadre[0][0] != 'v' && cadre[0][1] != 'v' && cadre[0][2] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 00");
            partie = 1;
        }
        if (cadre[1][0] == cadre[1][1] && cadre[1][1] == cadre[1][2] && cadre[1][2] == cadre[1][0] && cadre[1][0] != 'v' && cadre[1][1] != 'v' && cadre[1][2] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 01");
            partie = 1;
        }
        if (cadre[2][0] == cadre[2][1] && cadre[2][0] == cadre[2][2] && cadre[2][2] == cadre[2][1] && cadre[2][0] != 'v' && cadre[2][1] != 'v' && cadre[2][2] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 02");
            partie = 1;
        }
        //diagonal
        if (cadre[0][0] == cadre[1][1] && cadre[0][0] == cadre[2][2] && cadre[1][1] == cadre[2][2] && cadre[1][1] != 'v' && cadre[0][0] != 'v' && cadre[2][2] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 03");
            partie = 1;
        }
        if (cadre[0][2] == cadre[1][1] && cadre[0][2] == cadre[2][0] && cadre[1][1] == cadre[2][0] && cadre[1][1] != 'v' && cadre[0][2] != 'v' && cadre[2][0] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 04");
            partie = 1;
        }
        //colonne
        if (cadre[0][0] == cadre[1][0] && cadre[0][0] == cadre[2][0] && cadre[1][0] == cadre[2][0] && cadre[0][0] != 'v' && cadre[1][0] != 'v' && cadre[2][0] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 05");
            partie = 1;
        }
        if (cadre[0][1] == cadre[1][1] && cadre[0][1] == cadre[2][1] && cadre[1][1] == cadre[2][1] && cadre[0][1] != 'v' && cadre[1][1] != 'v' && cadre[2][1] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 06");
            partie = 1;
        }
        if (cadre[0][2] == cadre[1][2] && cadre[0][2] == cadre[2][2] && cadre[1][2] == cadre[2][2] && cadre[0][2] != 'v' && cadre[1][2] != 'v' && cadre[2][2] != 'v') {
            System.out.println("le joueur " + joueur + " a gagné 07");
            partie = 1;
        }
    }

    public Morpion2() throws IOException {

//nouvelle partie
        String v = new String();
        v = "a";

        resett();
        affiche(cadre);
        while (!"n".equals(v)) {
            //cadre = new char[taille][taille];
            //init

            //demande au joueur la case a remplir
            tomar();
            //verif si la case est libre et affectaction position du jeton
            verifsaisie();
            //changement de joueur
            //Affichage des pions actuels
            affiche(cadre);
            //verif si gagné
            verifgagne();
            if (partie == 1) {
                //System.out.println("nouvelle partie?");
                v = ConsoleUtil.liretext("nouvelle partie?, taper 0 pour continuer, taper n pour arreter");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Morpion2 morpion2 = new Morpion2();
    }
    //demande pour joueur2 la case a remplir
    //implementer la case pour le joueur concerné

    //changer de joueur
    //code fin de partie
    //demande si on veut recommencer.
    //INIT
}

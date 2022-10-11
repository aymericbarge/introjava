package test.fr;

import java.util.Random;
import java.util.Scanner;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random generateur = new Random();
        // System.out.print("Entrez un nom ");
        // String nom1 = clavier.next();
        // System.out.print("Entrez un nombre ");
        // double nombre = clavier.nextInt();
        // System.out.print("Entrez un autre nom ");
        // String nom2 = clavier.next();
        // System.out.println("Entrz un adjectif ");
        // String adjectif = clavier.next();
        // System.out.println("Il était une fois " + nom1 + " " + "qui avait " + nombre
        // + " " + nom2 + "."
        // + "Cela le rendait très " + adjectif);

        // Exo 1
        // int heures = 12;
        // int minutes = 34;
        // int secondes = 56;
        // int heuresEnSecondes = 12 * 3600;
        // int minutesEnSecondes = 34 * 60;
        // int secondesDepuisMinuit = heuresEnSecondes + minutesEnSecondes + secondes;
        // System.out.println("Il est " + heures + " h " + minutes + " mins " + secondes
        // + " s.");
        // System.out.println("Il s'est écoulé " + secondesDepuisMinuit + " secondes
        // depuis minuit.");

        // Exo2
        // System.out.println("Entrez le nombre d'heures : ");
        // int heures = clavier.nextInt();
        // System.out.println("Entrez le nombre de minutes : ");
        // int minutes = clavier.nextInt();
        // System.out.println("Entrez le,nombre de secondes : ");
        // int secondes = clavier.nextInt();
        // int heuresEnSecondes = heures * 3600;
        // int minutesEnSecondes = minutes * 60;
        // int secondesDepuisMinuit = heuresEnSecondes + minutesEnSecondes + secondes;
        // System.out.println("Il est " + heures + " h " + minutes + " mins " +
        // secondes+ " s.");
        // System.out.println("Il s'est écoulé " + secondesDepuisMinuit + "
        // secondesdepuis minuit.");

        // Exo3
        // System.out.println("Entrez le nombre d'heures : ");
        // int heures = clavier.nextInt();
        // System.out.println("Entrez le nombre de minutes : ");
        // int minutes = clavier.nextInt();
        // System.out.println("Entrez le,nombre de secondes : ");
        // int secondes = clavier.nextInt();
        // int heuresEnSecondes = heures * 3600;
        // int minutesEnSecondes = minutes * 60;
        // int minuits = 24 * 3600;
        // int secondesAvantMinuit = minuits - (heuresEnSecondes + minutesEnSecondes +
        // secondes);
        // System.out.println("Il est " + heures + " h " + minutes + " mins " +
        // secondes + " s.");
        // System.out.println("Il s'est écoulé " + secondesAvantMinuit + "
        // secondesdepuis minuit.");

        // Exo sur le if
        // int salaire = 400;
        // int prime = 250;
        // int quota = 10;

        // System.out.println("Entrez votre nombre de ventes");
        // int nombreDeVente = clavier.nextInt();
        // if (nombreDeVente >= quota) {
        // salaire = salaire + prime;
        // }
        // System.out.println("votre saliare est de : " + salaire);

        // }
        // Exo if/else
        // int salaire = 400;
        // int prime = 250;
        // int quota = 10;
        // System.out.println("Entrez votre nombre de ventes ");
        // int nombreDeVente = clavier.nextInt();
        // if (nombreDeVente >= quota) {
        // salaire = salaire + prime;
        // } else {
        // quota = quota - nombreDeVente;
        // System.out.println("Il vous manque " + quota + " ventes pour atteindre le
        // quota");
        // }

        // // Exo Café crème
        // System.out.println(" Entrez le nombre de piece de 1 centimes que vous avez.
        // ");
        // int piecesDe1 = clavier.nextInt();
        // System.out.println(" Entrez le nombre de piece de 5 centimes que vous avez.
        // ");
        // int piecesDe5 = clavier.nextInt();
        // System.out.println(" Entrez le nombre de piece de 10 centimes que vous avez.
        // ");
        // int piecesDe10 = clavier.nextInt();
        // System.out.println(" Entrez le nombre de piece de 20 centimes que vous avez.
        // ");
        // int piecesDe20 = clavier.nextInt();
        // System.out.println("Entrez le nombre de piece de 50 centimes que vous avez");
        // int piecesDe50 = clavier.nextInt();
        // int piecesJaune = piecesDe1 + piecesDe5 * 5 + piecesDe10 * 10 + piecesDe20 *
        // 20 + piecesDe50 * 50;
        // if (piecesJaune < 100) {
        // int pieceManquante = 100 - piecesJaune;
        // System.out.println("Il vous manque " + pieceManquante + " cents pour prendre
        // un café !");
        // } else if (piecesJaune == 100) {
        // System.out.println("Vous avez exactement de quoi vous avez vous payer le café
        // !");
        // } else if (piecesJaune > 100) {
        // int piecesEnTrop = piecesJaune - 100;
        // System.out.println("Il vous restera " + piecesEnTrop + " cents après avoir
        // pris votre café !");
        // }

        int victoire = 20;
        int numeroDeCase = 0;
        int nbLancer = 5;
        for (int i = 1; i <= nbLancer; i++) {
            int lancer = generateur.nextInt(6) + 1;
            numeroDeCase = numeroDeCase + lancer;
        }
        if (numeroDeCase == victoire) {
            System.out.println("Bravo vous avez gagner");
        } else {
            System.out.println("Vous avez perdu");
        }
        System.out.println(numeroDeCase);

    }
}
package test.fr;

import java.util.Random;
import java.util.Scanner;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
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
        // // }
        // Random generateur = new Random();
        // int victoire = 20;
        // int numeroDeCase = 0;
        // int nbLancer = 5;
        // while (numeroDeCase != 20) {
        // numeroDeCase = 0;
        // for (int i = 1; i <= nbLancer; i++) {
        // int lancer = generateur.nextInt(6) + 1;
        // numeroDeCase = numeroDeCase + lancer;
        // }
        // if (numeroDeCase == victoire) {
        // System.out.println("Bravo vous avez gagner");
        // } else {
        // System.out.println("Vous avez perdu");
        // }
        // System.out.println(numeroDeCase);
        // TD n°3 Suite 1
        // for (int i=-4; i<=86;i+=18){
        // System.out.println(i);
        // }
        // suite 2
        // int count = 0;
        // int a = 0;
        // int b = 1;
        // System.out.print(a + " " + b + " ");
        // while (count <= 20) {
        // var current = a + b;
        // System.out.print(current + " ");
        // a = b;
        // b = current;
        // count++;
        // }
        // System.out.println();
        // suite 3
        // for (int i = 1; i <= 10; i++) {
        // System.out.print(i * i + " ");
        // }
        // System.out.println();
        // Suite 4
        // for (int i = 1; i <= 10; i++) {
        // System.out.print((int) Math.pow(i, 2) + " ");
        // }
        // Avec les commande qui corresponde
        // motif7(0,9,3,false,3); //motif du 7
        // motif7(9,0,5,true,5); //motif du 8
        // motif7(0, 9, 0, false, 4); // motif du 9
        // motif 2
        // System.out.println("Entrez le nombre de repetition");
        // int nombreDeRepetition = clavier.nextInt();
        // int nombreDeLigne = 1;
        // for (int i = nombreDeLigne; i < nombreDeRepetition + 1; i++) {
        // System.out.println("*****");
        // }
        // motif 3
        // System.out.println("Entrez le nombre de ligne ");
        // int nombreDeLigne = clavier.nextInt();
        // for (int i = 1; i <= nombreDeLigne; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // }
        // System.out.println(" ");
        // }
        // motif triangle pascal
        // System.out.print("Entrez le nombre de ligne: ");
        // int nombreDeLigne = clavier.nextInt();
        // System.out.print("Entrez le symbole que vous voulez ");
        // char symbole = clavier.next().charAt(0);
        // for (int r = 0; r < nombreDeLigne; r++) {
        // for (int c = nombreDeLigne - r; c > 1; c--)
        // System.out.print(" ");
        // for (int c = 0; c <= r; c++)
        // System.out.print(symbole);
        // System.out.println();
        // // motif 4
        System.out.print("Entrez le nombre de ligne que vous voulez ; ");
        int taille = clavier.nextInt();
        for (int nombreDeLigne = 1; nombreDeLigne <= taille; nombreDeLigne++) {
            for (int nombreDeColonne = 1; nombreDeColonne <= nombreDeLigne; nombreDeColonne++) {
                System.out.print(nombreDeLigne);
            }
            System.out.println();

        }
    }

    // td n°3 motif 7 8 9 avec les commande a mettre dans le main
    // static void motif7(int dep, int end, int nb, boolean reverted, int lines) {
    // for (int i = 1; i <= lines; i++) {
    // var it = dep;
    // var cond = true;
    // int variable = (nb == 0) ? dep : nb;

    // while (cond) {
    // if (reverted) {
    // for (int j = 1; j <= variable; j++) {
    // System.out.print(it);
    // }
    // it--;
    // cond = (it >= end) ? true : false;
    // }

    // else {
    // for (int j = 1; j <= variable; j++) {
    // System.out.print(it);
    // }
    // it++;
    // cond = (it <= end) ? true : false;
    // }
    // if (nb == 0 && reverted)
    // variable--;
    // else if (nb == 0 && reverted == false)
    // variable++;
    // }

    // System.out.println();
    // }
    // }

}

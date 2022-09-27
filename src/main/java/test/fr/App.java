package test.fr;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nom ");
        String nom1 = clavier.next();
        System.out.print("Entrez un nombre ");
        double nombre = clavier.nextInt();
        System.out.print("Entrez un autre nom ");
        String nom2 = clavier.next();
        System.out.println("Entrz un adjectif ");
        String adjectif = clavier.next();
        System.out.println("Il était une fois " + nom1 + " " + "qui avait " + nombre + " " + nom2 + "."
                + "Cela le rendait très " + adjectif);
    }

}
//
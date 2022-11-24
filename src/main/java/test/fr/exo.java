package test.fr;

import java.util.Random;
import java.util.Scanner;

public class exo {

    static void deviner() {
        int gen = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        int valeur = scan.nextInt();
        if (valeur == gen)
            System.out.println("Vous avez gagné");
        else
            System.out.println("Perdu ! La valeur était " + gen);
        scan.close();
    }

    static void deviner2() {
        int gen = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        int valeur = scan.nextInt();

        if (valeur > gen)
            System.out.println("Perdu ! vous avez dépassé de " + (valeur - gen));
        else if (valeur < gen)
            System.out.println("Perdu ! Il manquait  " + (gen - valeur));
        else
            System.out.println("C'est gagné !");
        scan.close();
    }

    static void deviner3() {
        int gen = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        boolean gagner = false;
        int essaie = 1;
        while (!gagner) {
            int valeur = scan.nextInt();
            if (valeur > gen)
                System.out.println("Trop grand");
            else if (valeur < gen)
                System.out.println("Trop petit;");
            else {
                System.out.println("C'est bon ! Vous avez gagné en " + essaie + " tentatives.");
                gagner = true;
            }
            essaie++;
        }
        scan.close();
    }

    static void deviner4() {
        boolean break_loop = false;
        Random generer = new Random();
        System.out.println("Je pense à un nombre entre 1 et 100. Devinez lequel. ");
        Scanner scan = new Scanner(System.in);

        while (!break_loop) {
            int gen = generer.nextInt(100);
            boolean gagner = false;
            int essaie = 1;
            while (!gagner) {
                System.out.print("Entrez un nombre :");
                int valeur = scan.nextInt();
                boolean cond = (valeur >= 0) && (valeur <= 100);
                if (valeur > gen && cond) {
                    System.out.println("Trop grand");
                    essaie++;
                } else if (valeur < gen && cond) {
                    System.out.println("Trop petit;");
                    essaie++;
                } else if (valeur == gen && cond) {
                    System.out.println("C'est bon ! Vous avez gagné en " + essaie + " tentatives.");
                    gagner = true;
                    System.out.println("Rejouer ? (O/N)");
                    String replay = scan.next().toLowerCase();
                    System.out.println(replay);
                    if (!(replay.equals("o")))
                        break_loop = true;
                } else {
                    System.out.println("Veuillez entrer un nombre entre 0 et 100.");
                }
            }
        }
        scan.close();
    }

    static void deviner5() {
        Random gene = new Random();
        int gen = gene.nextInt(100);
        System.out.println("Je pense à un nombre que j'essaie de deviner.");
        boolean gagner = false;
        int essaie = 1;
        int upperbound = 100;
        int lowerbound = 0;
        while (!gagner) {
            int valeur = gene.nextInt(upperbound - lowerbound) + lowerbound;
            System.out.println("Je tente : " + valeur);
            if (valeur > gen) {
                upperbound = valeur;
                System.out.println("Trop grand.");
            } else if (valeur < gen) {
                lowerbound = valeur;
                System.out.println("Trop petit.");
            } else {
                System.out.println("J'ai trouvé en " + essaie + " tentatives.");
                gagner = true;
            }
            essaie++;
        }
    }

    static void deviner7(int tours) {
        Random gene = new Random();
        int gen = gene.nextInt(100);
        System.out.println("Je pense à un nombre que j'essaie de deviner.");

        int upperbound = 100;
        int lowerbound = 0;
        int i = 0;

        int[] array = new int[tours];
        while (i < tours) {
            boolean gagner = false;
            int essaie = 1;
            while (!gagner) {
                int valeur = gene.nextInt(upperbound - lowerbound) + lowerbound;
                System.out.println("Je tente : " + valeur);
                essaie++;
                if (valeur > gen) {
                    upperbound = valeur;
                    System.out.println("Trop grand.");
                } else if (valeur < gen) {
                    lowerbound = valeur;
                    System.out.println("Trop petit.");
                } else {
                    System.out.println("J'ai trouvé en " + essaie + " tentatives.");
                    gagner = true;
                }
            }
            array[i] = essaie;
            i++;
        }
        double resultat = 0;
        for (int z : array)
            resultat += z;
        resultat /= tours;
        System.out.println("En moyenne, sur " + tours + " parties, il m'a fallu " + resultat + " tentatives.");
    }

    static void deviner8(int tours) {
        Random gene = new Random();
        int i = 0;
        int[] array = new int[tours];
        boolean bug = false;
        while (i < tours) {
            System.out.print(i + " - ");
            boolean gagner = false;
            int essaie = 0;
            int upperbound = 100;
            int lowerbound = 0;
            int gen = gene.nextInt(99) + 1;
            double valeur = 50;

            while (!gagner) {
                System.out.print((int) valeur + " ");
                essaie++;
                if ((int) valeur > gen) {
                    upperbound = (int) valeur;
                    valeur = upperbound - (int) ((upperbound - lowerbound) / 2);
                } else if ((int) valeur < gen) {
                    lowerbound = (int) valeur;
                    valeur = (int) (lowerbound + ((upperbound - lowerbound) / 2));
                } else {
                    gagner = true;
                }
                if (essaie == 15) {
                    bug = true;
                    break;
                }
            }
            array[i] = essaie;

            System.out.println("[" + essaie + "]");
            i++;
        }
        if (bug) {
            System.out.println("Il y a eu un bug.");
        }

        double resultat = 0;
        for (int z : array)
            resultat += z;
        resultat /= tours;
        System.out.println("En moyenne, sur " + tours + " parties, il m'a fallu " + resultat + " tentatives.");
    }

    static void deviner9(int tours) {
        Random gene = new Random();
        int i = 0;
        int[] array = new int[tours];
        boolean bug = false;
        while (i < tours) {
            boolean gagner = false;
            int essaie = 0;
            int upperbound = 100;
            int lowerbound = 0;
            int gen = gene.nextInt(99) + 1;
            double valeur = 50;

            while (!gagner) {
                essaie++;
                if ((int) valeur > gen) {
                    upperbound = (int) valeur;
                    valeur = upperbound - (int) ((upperbound - lowerbound) / 2);
                } else if ((int) valeur < gen) {
                    lowerbound = (int) valeur;
                    valeur = (int) (lowerbound + ((upperbound - lowerbound) / 2));
                } else {
                    gagner = true;
                }
                if (essaie == 15) {
                    bug = true;
                    break;
                }
            }
            array[i] = essaie;

            i++;
        }
        if (bug) {
            System.out.println("Il y a eu un bug.");
        }

        double resultat = 0;
        for (int z : array)
            resultat += z;
        resultat /= tours;
        System.out.println("En moyenne, sur " + tours + " parties, il m'a fallu " + resultat + " tentatives.");
    }

    public static void main(String[] args) {
        // deviner1();
        // deviner2();
        // deviner3();
        // deviner4();
        // deviner5();
        // guess8(50000);
        // deviner9(1000000);
    }
}

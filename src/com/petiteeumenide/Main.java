package com.petiteeumenide;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hauteur = 0;
        Scanner clavier = new Scanner(System.in);
        int i = 0;

        // saisie d'un nombre entier et positif
        while (hauteur <= 0) {
            System.out.println("Merci d'entrer la taille désirée pour le triangle :");
            try {
                hauteur = clavier.nextInt();
            } catch (Exception erreur) {
                System.out.println("Erreur");
                clavier.nextLine();
            }
        }
        //dessin du sapin
        while (i <= hauteur) {
            int j = 0;
            while (j < (hauteur - i)) {
                System.out.print(" ");
                j++;
            }
            System.out.print("A");
            int k = 0;
            while (k < 2 * i - 1) {
                System.out.print("*");
                k++;

            }
            i++;
            if (i > 1) {
                System.out.print("A\n");
            } else {
                System.out.print("\n");
            }

        }
    }
}

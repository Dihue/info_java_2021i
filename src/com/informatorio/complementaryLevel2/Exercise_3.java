package com.informatorio.complementaryLevel2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;
/*
Crear una lista que contenga como elementos la numeración de cartas
de una baraja francesa (solo los valores, no figuras). Se deberá
cargar el ArrayList (en orden), imprimir, imprimir en orden inverso
(reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 */
public class Exercise_3 {
    public static void main(String[] args) {
        List<Integer> deckCards = new ArrayList<>();

        listCards(deckCards);

        System.out.println("Ordered:");
        for (Integer ordered : deckCards) {
            System.out.print(ordered + " ");
        }

        System.out.println("\nReversed:");
        for (int i = deckCards.size(); i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nDisorder:");
        shuffle(deckCards);
        for (Integer disorder : deckCards) {
            System.out.print(disorder + " ");
        }
    }

    private static void listCards(List<Integer> deckCards) {
        deckCards.add(1);
        deckCards.add(2);
        deckCards.add(3);
        deckCards.add(4);
        deckCards.add(5);
        deckCards.add(6);
        deckCards.add(7);
        deckCards.add(8);
        deckCards.add(9);
        deckCards.add(10);
    }
}
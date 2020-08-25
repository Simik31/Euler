package cz.osu.student.R19584.Problem_0XX.Problem_05X;

/*

DATA: https://projecteuler.net/project/resources/p054_poker.txt

In the card game poker, a hand consists of five cards and are ranked, from lowest to highest, in the following way:

High Card: Highest value card.
One Pair: Two cards of the same value.
Two Pairs: Two different pairs.
Three of a Kind: Three cards of the same value.
Straight: All cards are consecutive values.
Flush: All cards of the same suit.
Full House: Three of a kind and a pair.
Four of a Kind: Four cards of the same value.
Straight Flush: All cards are consecutive values of same suit.
Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.

The cards are valued in the order:
2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace.

If two players have the same ranked hands then the rank made up of the highest value wins; for example, a pair of eights beats a pair of fives (see example 1 below). But if two ranks tie, for example, both players have a pair of queens, then highest cards in each hand are compared (see example 4 below); if the highest cards tie then the next highest cards are compared, and so on.

Consider the following five hands dealt to two players:

Hand	 Player 1	 	   Player 2	 	      Winner
1	 	 5H 5C 6S 7S KD    2C 3S 8S 8D TD     Player 2
         Pair of Fives     Pair of Eights

2	 	 5D 8C 9S JS AC    2C 5C 7D 8S QH     Player 1
         Highest card Ace  Highest card Queen

3	 	 2D 9C AS AH AC    3D 6D 7D TD QD      Player 2
         Three Aces        Flush with Diamonds

4	 	 4D 6S 9H QH QC    3D 6D 7H QD QS      Player 1
         Pair of Queens    Pair of Queens
         Highest card Nine  Highest card Seven

5	 	2H 2D 4C 4D 4S     3C 3D 3S 9S 9D      Player 1
        Full House         Full House
        With Three Fours   with Three Threes

The file, poker.txt, contains one-thousand random hands dealt to two players. Each line of the file contains ten cards (separated by a single space): the first five are Player 1's cards and the last five are Player 2's cards. You can assume that all hands are valid (no invalid characters or repeated cards), each player's hand is in no specific order, and in each hand there is a clear winner.

How many hands does Player 1 win?

 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Problem_054 {
    public static long main() {
        HashMap<String, Integer> cards_values = new HashMap<>();
        cards_values.put("2",  2);
        cards_values.put("3",  3);
        cards_values.put("4",  4);
        cards_values.put("5",  5);
        cards_values.put("6",  6);
        cards_values.put("7",  7);
        cards_values.put("8",  8);
        cards_values.put("9",  9);
        cards_values.put("T", 10);
        cards_values.put("J", 11);
        cards_values.put("Q", 12);
        cards_values.put("K", 13);
        cards_values.put("A", 14);
        HashMap<String, Integer> cards_suits = new HashMap<>();
        cards_suits.put("C",  1);
        cards_suits.put("D",  2);
        cards_suits.put("H",  3);
        cards_suits.put("S",  4);
        int player_1_win_counter = 0, hand_1_comb_id, hand_2_comb_id;
        try {
            Scanner reader = new Scanner(new File("data/054.txt"));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                ArrayList<Integer> hand_1_values = new ArrayList<>();
                ArrayList<Integer> hand_2_values = new ArrayList<>();
                ArrayList<Integer> hand_1_suits = new ArrayList<>();
                ArrayList<Integer> hand_2_suits = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    hand_1_values.add(cards_values.get(line.substring(i * 3, i * 3 + 1)));
                    hand_2_values.add(cards_values.get(line.substring(i * 3 + 15, i * 3 + 16)));
                    hand_1_suits.add(cards_suits.get(line.substring(i * 3 + 1, i * 3 + 2)));
                    hand_2_suits.add(cards_suits.get(line.substring(i * 3 + 16, i * 3 + 17)));
                }
                hand_1_comb_id = findBestCombination(hand_1_values, hand_1_suits, 109);
                hand_2_comb_id = findBestCombination(hand_2_values, hand_2_suits, 109);
                int max_id = 14;
                while (hand_1_comb_id == hand_2_comb_id) {
                    hand_1_comb_id = findBestCombination(hand_1_values, hand_1_suits, max_id);
                    hand_2_comb_id = findBestCombination(hand_2_values, hand_2_suits, max_id);
                    max_id--;
                }
                if (hand_1_comb_id > hand_2_comb_id) player_1_win_counter++;
            }
        } catch (Exception ignored) {
            System.exit(-1);
        }
        return player_1_win_counter;
    }

    private static int findBestCombination(ArrayList<Integer> values, ArrayList<Integer> suits, int max_id) {
        Collections.sort(values);
        int i, j, k, l, counter, counter_2;
        if(suits.get(0).equals(suits.get(1)) && suits.get(0).equals(suits.get(2)) && suits.get(0).equals(suits.get(3)) && suits.get(0).equals(suits.get(4))) {
            if(values.get(0).equals(10) && values.get(1).equals(11) && values.get(2).equals(12) && values.get(3).equals(13) && values.get(4).equals(14) && max_id > 108) return 109;
            if(values.get(0).equals(values.get(1) - 1) && values.get(1).equals(values.get(2) - 1) && values.get(2).equals(values.get(3) - 1) && values.get(3).equals(values.get(4) - 1) && max_id > 107) return 108;
            if(max_id > 104) return 105;
        }
        for(i = 0; i < 5; i++) {
            counter = 0;
            for(j = 0; j < 5; j++) if(values.get(i).equals(values.get(j))) counter++;
            if(counter == 4 && max_id > 106) return 107;
            if(counter == 3 && max_id > 102) return 70 + values.get(i);
        }
        for(i = 0; i < 5; i++) {
            counter = 0;
            for(j = 0; j < 5; j++) if(values.get(i).equals(values.get(j))) counter++;
            if(counter == 3) {
                for(k = 0; k < 5; k++) {
                    counter_2 = 0;
                    for(l = 0; l < 5; l++) if(values.get(k).equals(values.get(l))) counter_2++;
                    if(counter_2 == 2 && max_id > 105) return 106;
                }
            } else if(counter == 2) {
                for(k = 0; k < 5; k++) {
                    if(values.get(k).equals(values.get(i))) continue;
                    counter_2 = 0;
                    for(l = 0; l < 5; l++) if(values.get(k).equals(values.get(l))) counter_2++;
                    if(counter_2 == 2 && max_id > 101) return 50 + values.get(i);
                }
            }
        }
        if(values.get(0).equals(values.get(1) - 1) && values.get(1).equals(values.get(2) - 1) && values.get(2).equals(values.get(3) - 1) && values.get(3).equals(values.get(4) - 1) && max_id > 103) return 104;
        for(i = 0; i < 5; i++) {
            counter = 0;
            for(j = 0; j < 5; j++) if(values.get(i).equals(values.get(j))) counter++;
            if(counter == 2 && max_id > 100) return 30 + values.get(i);
        }
        i = 4;
        while(values.get(i) > max_id) i--;
        return values.get(i);
    }
}
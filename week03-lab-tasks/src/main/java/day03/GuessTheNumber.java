package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(1,101);

        boolean solved = false;
        int cycleCounter = 6;
        System.out.println("Gondoltam egy számra, próbáld meg kitalálni.");

        while (cycleCounter > 0 && !solved) {
            System.out.print("Kérem a tipped: ");
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (guess == numberToGuess) {
                solved = true;
            }
            else {
                if (guess < numberToGuess) {
                    System.out.println("Én egy kicsit nagyobb számra gondoltam.");
                }
                else {
                    System.out.println("Én egy kicsit kisebb számra gondoltam.");
                }
            }
            cycleCounter--;
        }
        if (solved) {
            System.out.println("Nagyon ügyes vagy, kitaláltad a számot!");
        }
        else {
            System.out.println("6. próbálkozás után inkább elárulom, hogy a szám amire gondoltam: " + numberToGuess);
        }
    }
}

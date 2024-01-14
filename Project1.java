/*1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
   is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won*/

import java.util.Random;
import java.util.*;

public class Project1 {

    public static void fun() {
        int ch;
        int score = 0;
        do {
            Scanner obj = new Scanner(System.in); // Object Of Scanner Class To Take Input From User

            Random ob = new Random(); // Object Of Random Class To Generate A Random Number
            int random = ob.nextInt(100); // Generating Random Number

            for (int i = 1; i <= 5; i++) { // 5 Chances For Guessing The Number
                System.out.print("                  Guess the number : ");
                int n = obj.nextInt();

                if (random == n) {
                    System.out.print("Yeah.....U win"); // If Random No & Guessed No is Same
                    score=(6-i)*20;
                }

                else {
                    if (i == 5) {
                        System.out.println("\n                  GAME OVER"); // Game Over
                        System.out.println("\n                  The Number was : " + random);
                    } else {
                        System.out.println("You Have Next Chance....");
                    }
                }
            }

            System.out.println("                  Your score is " + score); // Generating Score

            System.out.println("\n************Enter your choice : **************");
            System.out.println("1. Play Againg");
            System.out.println("2. Exit");
            ch = obj.nextInt();

            switch (ch) {
                case 1:
                    fun(); // For Play Again
                    break;
                case 2:
                    System.exit(0); // for End The Game
                    break;
            }
        } while (ch == 1);
    }

    public static void main(String args[]) { // Main Method
        System.out.println("****************Guess The Number****************");
        System.out.println("\nCHOOSE ANY NUMBER FROM 0 TO 100");
        System.out.println("\nCONDITIONS :");
        System.out.println("1.You have 5 Chances To Guess The Number. \n2.For Any Attempt You Have 20 Points");
        System.out.println("\n**********************************************");
        fun();
    }
}

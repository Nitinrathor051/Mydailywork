import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finalScore = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Player, you have " + chances + " chances to win the game.");

        while (playAgain) {
            int rand = getRandN(1, 100);
            boolean guess = false;

            for (int i = 0; i < chances; i++) {
                System.out.println("Chance " + (i + 1) + ": Enter your guess:");
                int user = sc.nextInt();

                if (user == rand) {
                    guess = true;
                    finalScore += 1;
                    System.out.println("You won!");
                    break;
                } else if (user > rand) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guess) {
                System.out.println("Sorry, player. You lost this round. The correct number was " + rand + ".");
            }

            System.out.println("Do you want to play again? (Y/N)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("Y");
        }

        System.out.println("That's it, player! Hope you enjoyed it.");
        System.out.println("Here is your score: " + finalScore);

        sc.close();
    }

    public static int getRandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

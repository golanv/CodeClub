import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter \"1\" for \"Rock,\" \"2\" for \"Paper,\""
                + "\"3\" for \"Scissors,\" or \"0\" to quit: ");
        int num = input.nextInt();
        int win = 0;
        int lose = 0;
        
        while (num != 0) {
        int r = (int) (Math.random() * (4 - 1))   + 1;      
        
        if (r == 1) {
            switch (num) {
                case 1:
                    System.out.print("Rock!  Tie, try again: ");
                    break;
                case 2:
                    System.out.print("Rock!  You win. ");
                    System.out.print("Try again: ");
                    win += 1;
                    break;
                case 3:
                    System.out.println("Rock!  You lose.");
                    System.out.print("Try again: ");
                    lose += 1;
                    break;
                default:
                    System.out.print("Enter a valid number: ");
                    break;
            }
            num = input.nextInt();
        } else if (r == 2) {
            switch (num) {
                case 1:
                    System.out.println("Paper!  You lose! ");
                    System.out.print("Try again: ");
                    lose += 1;
                    break;
                case 2:
                    System.out.print("Paper! Tie, try again: ");
                    break;
                case 3:
                    System.out.println("Paper!  You win.");
                    System.out.print("Try again: ");
                    win += 1;
                    break;
                default:
                    System.out.print("Enter a valid number: ");
                    break;
            }
            num = input.nextInt();
        } else {
            switch (num) {
                case 1:
                    System.out.println("Scissors!  You win. ");
                    System.out.print("Try again: ");
                    win += 1;
                    break;
                case 2:
                    System.out.println("Scissors! You Lose! ");
                    System.out.print("Try again: ");
                    lose += 1;
                    break;
                case 3:
                    System.out.print("Scissors!  Tie, try again!");
                    break;
                default:
                    System.out.print("Enter a valid number: ");
                    break;
            }
            num = input.nextInt();
        }
        
        } 
        System.out.println("You have won " + win + " time(s).");
        System.out.println("You have lost " + lose + " time(s).");
    }    
}

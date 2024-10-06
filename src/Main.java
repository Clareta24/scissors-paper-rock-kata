import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Player 1");

        String player1 = myObj.nextLine();
        System.out.println("Player 1 is: " + player1);

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter Player 2");

        String player2 = myObj2.nextLine();
        System.out.println("Player 2 is: " + player2);

        String result = "";

        if (player1.equals(player2)) {
            result = "Draw!";
        } else if (player1.equals("scissors")) {
            if (player2.equals("paper")) {
                result = "Player 1 Wins!";
            }
            if (player2.equals("rock")) {
                result = "Player 2 Wins!";
            }
        } else if (player1.equals("paper")) {
            if (player2.equals("rock")) {
                result = "Player 1 Wins!";
            }
            if (player2.equals("scissors")) {
                result = "Player 2 Wins!";
            }
        } else if (player1.equals("rock")) {
            if (player2.equals("scissors")) {
                result = "Player 1 Wins!";
            }
            if (player2.equals("paper")) {
                result = "Player 2 Wins!";
            }
        }

        System.out.println(player1 + " + "  + player2 + " = " + result);
    }
}
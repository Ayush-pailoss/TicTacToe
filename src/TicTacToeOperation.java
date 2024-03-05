import java.util.Scanner;

public class TicTacToeOperation extends TicTacToeBoardService {
  static  void  operation(){
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to the  Tic Tac Toe.");
        printBoard();

        System.out.println(
                "X will play first. enter number");
        int numInput = 0;
        while (winner == null) {
            numInput = in.nextInt();
            if ((numInput > 0 && numInput <= 9)) {
                System.out.println(" ");
            }else {

                System.out.println(
                        "Invalid input; re-enter slot number:");}


            if (board[numInput - 1].equals(
                    String.valueOf (numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println(
                        "Slot already taken; re-enter number");
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }
        else {

            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }

    }
}

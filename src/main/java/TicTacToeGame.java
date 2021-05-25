import java.util.Locale;
import java.util.Scanner;

public class TicTacToeGame {
    private static char[] board;

    //    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe");
        char[] board = createBoard();
        char userLetter = enterInput(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        showBoard();
        char computerChoice = enterInput();
    }

    private static char enterInput() {
        return 0;
    }

    static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i <= 10; i++) {
            board[i] = ' ';
        }
        return board;

    }

    private static char enterInput(Scanner userInput) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose x or o");
//        String userChoice = scanner.next();
//        String computer;
//        if(userChoice != "x" || userChoice != "o"  ){
//            System.out.println("Enter valid Input");
//            enterInput();
//        }
//        if(userChoice.equals('x'))
//            computer = "o";
//        else
//            computer = "x";
//
        return userInput.next().toUpperCase().charAt(0);
    }

    static void showBoard() {
        System.out.println("|---|---|---|");

        System.out.println("| " + board[1] + " | " +
                board[2] + " | " + board[3] + " | ");

        System.out.println("| " + board[4] + " | " +
                board[5] + " | " + board[6] + " | ");

        System.out.println("| " + board[7] + " | " +
                board[8] + " | " + board[9] + " | ");
    }

    int userMove() {
        System.out.println("Enter your move(Between 1 to 9)");
        Scanner scanner = new Scanner(System.in);
        int userMove = scanner.nextInt();
        if (board[userMove] == ' ')

            return userMove;
        else{
            System.out.println("Invalid Move: Please play a valid move..." +
                    "move should be other than " + userMove);
            userMove();
            return 0;
        }


    }

}

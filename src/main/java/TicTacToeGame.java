import java.util.Scanner;

public class TicTacToeGame {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe");
        char[] board = createBoard();

        String computerChoice = enterInput();
    }

    static char[] createBoard(){
        char[] board = new char[10];
        for(int i=1; i<=10;i++){
            board[i] = '-';
        }
        return board;

    }
    static String enterInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose x or o");
        String userChoice = scanner.next();
        String computer;
        if(userChoice != "x" || userChoice != "o"  ){
            System.out.println("Enter valid Input");
            enterInput();
        }
        if(userChoice.equals('x'))
            computer = "o";
        else
            computer = "x";

        return computer;
    }
}

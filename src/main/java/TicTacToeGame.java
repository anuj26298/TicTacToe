import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe");
        char[] board = createBoard();
        char userLetter = enterInput(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }

    private static char[] createBoard(){
        char[] board = new char[10];
        for(int i=1; i<=10;i++){
            board[i] = ' ';
        }
        return board;

    }
    private static char enterInput(Scanner userInput){
        System.out.println("Choose your letter(X or O");
        return userInput.next().toUpperCase().charAt(0);
    }

   

}

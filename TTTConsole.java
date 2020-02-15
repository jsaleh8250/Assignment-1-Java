import java.util.Scanner;
/**
 * Tic-Tac-Toe: Two-player console, non-graphics
 * @author relkharboutly
 * @date 1/5/2017
 */
public class TTTConsole {
                                                     
      public static Scanner in = new Scanner(System.in); // the input Scanner
 
   public static TicTacToe TTTboard = new TicTacToe();
   public static int PLAYER =1 , COMPUTER = 2;
   /** The entry main method (the program starts here) */
   public static void main(String[] args) {
      
	   int currentState = TicTacToe.PLAYING;
	   String userInput;
	   //game loop
	   while (currentState == ITicTacToe.PLAYING) {
		    TTTboard.printBoard();
         // Print message if game-over
         currentState = TTTboard.checkForWinner();
         
         if (currentState == ITicTacToe.PLAYING) {
        	 System.out.println("To play the game enter a number between 0-8.");
        	 int location = in.nextInt();
        	TTTboard.setMove(PLAYER, location);
        	TTTboard.setMove(COMPUTER, TTTboard.getComputerMove());
         }
	  
         if (currentState == ITicTacToe.CROSS_WON) {
            System.out.println("'X' won! Bye!");
         } else if (currentState == ITicTacToe.NOUGHT_WON) {
            System.out.println("'O' won! Bye!");
         } else if (currentState == ITicTacToe.TIE) {
            System.out.println("It's a TIE! Bye!");
         }
         //user can break the loop. remove this line when you finish implementation.
         //userInput = in.next();
	   }
	   }
}
  

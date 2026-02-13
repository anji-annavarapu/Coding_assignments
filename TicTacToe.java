import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static String[] board=new String[9];
    static String turn;

    static String checkWinner(){
        for(int i=0;i<8;i++){
            String line=null;
            switch(i){
                case 0:
                    line=board[0]+board[1]+board[2];
                    break;
                case 1:
                    line=board[3]+board[4]+board[5];
                    break;
                case 2:
                    line=board[6]+board[7]+board[8];
                    break;
                case 3:
                    line=board[0]+board[3]+board[6];
                    break;
                case 4:
                    line=board[1]+board[4]+board[7];
                    break;
                case 5:
                    line=board[2]+board[5]+board[8];
                    break;
                case 6:
                    line=board[0]+board[4]+board[8];
                    break;
                case 7:
                    line=board[2]+board[4]+board[6];
                    break;
            }
            // For X Winner
            if(line.equals("XXX")) return "X";
            // For O Winner
            else if(line.equals("OOO")) return "O";
        }
        for(int j=0;j<9;j++){
            if(Arrays.asList(board).contains(String.valueOf(j+1))){
                break;
            } else if (j==8) {
                return "draw";
            }
        }
        System.out.println(turn+"'s turn; enter a slot number to place "+ turn +" in: ");
        return null;
    }

    static void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
        System.out.println("|---|---|---|");
        System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |");
        System.out.println("|---|---|---|");
        System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |");
        System.out.println("|---|---|---|");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String winner=null;
        turn="X";
        for(int i=0;i<9;i++){
            board[i]=String.valueOf(i+1);
        }
        printBoard();
        System.out.println("Welcome to 3*3 Tic Tac Toe.");
        System.out.println("X will play first.Enter a slot number to place X.");
        while(winner==null){
            try {
                int input=sc.nextInt();
                // Check range of input is valid
                if(input<0 || input>9){
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }
                if(board[input-1].equals(String.valueOf(input))){
                    board[input-1]=turn;
                    turn=turn.equals("X")?"O":"X";
                    printBoard();
                    winner=checkWinner();
                }
                else System.out.println("Slot Not available. Please try again.");
            }catch (InputMismatchException e){
                System.out.println("Invalid input. re-enter slot number.");
                sc.nextInt();
            }
        }

        if(winner.equalsIgnoreCase("draw")){
            System.out.println("It's a draw! Thanks for playing.");
        }else {
            System.out.println("Congratulations! "+winner+" 's have won! thanks for playing.");
        }
        sc.close();
    }
}

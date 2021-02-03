import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		char[][] Spielbrett = {{' ', '|', ' ', '|', ' '}, 
				               {'-', '+', '-', '+', '-'},
				               {' ', '|', ' ', '|', ' '}, 
				               {'-', '+', '-', '+', '-'}, 
				               {' ', '|', ' ', '|', ' '}};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Placement (1-9):");
		int pos = scan.nextInt();
		
		System.out.println(pos);
		
		
		for(char [] row: Spielbrett) {
	    	for(char c : row) {
	    		System.out.print(c);
	  
	    	}
	    	 System.out.println();
	    	 
	    }
	
	}

}

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		char[][] Spielbrett = {{' ', '|', ' ', '|', ' '}, 
				               {'-', '+', '-', '+', '-'},
				               {' ', '|', ' ', '|', ' '}, 
				               {'-', '+', '-', '+', '-'}, 
				               {' ', '|', ' ', '|', ' '}};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Wo m�chtest du setzten (1-9):");
		int pos = scan.nextInt();
		
		System.out.println(pos);
		
		
		for(char [] row: Spielbrett) {
	    	for(char c : row) {
	    		System.out.print(c);
	  
	    	}
	    	 System.out.println();
	    	 
	    	// x an den verschiedenen pos setzten 
	    	 
	    	 switch(pos) {
	    	 	case 1: 
	    	 		Spielbrett[0][0] = 'X';
	    	 		break;
	    	 	case 2: 
	    	 		Spielbrett[0][2] = 'X';
	    	 		break;
	    	 	case 3: 
	    	 		Spielbrett[0][4] = 'X';
	    	 		break;
	    	 	case 4: 
	    	 		Spielbrett[2][0] = 'X';
	    	 		break;
	    	 	case 5: 
	    	 		Spielbrett[2][2] = 'X';
	    	 		break;
	    	 	case 6: 
	    	 		Spielbrett[2][4] = 'X';
	    	 		break;
	    	 	case 7: 
	    	 		Spielbrett[4][0] = 'X';
	    	 		break;
	    	 	case 8: 
	    	 		Spielbrett[4][2] = 'X';
	    	 		break;
	    	 	case 9: 
	    	 		Spielbrett[4][4] = 'X';
	    	 		break;
	    	 		
	    	 
	    }
	
		
		
	}
		
	}
	
}

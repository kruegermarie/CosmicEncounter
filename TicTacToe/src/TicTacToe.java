
public class TicTacToe {

	public static void main(String[] args) {
		
		
		// Erstellen des Spielbretts 
		char[][] Spielbrett = {{' ', '|', ' ', '|', ' '}, 
				               {'-', '+', '-', '+', '-'},
				               {' ', '|', ' ', '|', ' '}, 
				               {'-', '+', '-', '+', '-'}, 
				               {' ', '|', ' ', '|', ' '}};
		
		for(char [] row: Spielbrett) {
	    	for(char c : row) {
	    		System.out.print(c);
	  
	    	}
	    	 System.out.println();
	    	 
	    }
	
	}

}

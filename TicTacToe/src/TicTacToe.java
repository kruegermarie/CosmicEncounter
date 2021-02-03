
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

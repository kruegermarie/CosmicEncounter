import java.util.Random; //pos for cpu
import java.util.Scanner; //pos for player

public class progmeth {

	public static void main(String[] args) {

		char[][] Spielbrett = {{' ', '|', ' ', '|', ' '}, 
	               {'-', '+', '-', '+', '-'},
	               {' ', '|', ' ', '|', ' '}, 
	               {'-', '+', '-', '+', '-'}, 
	               {' ', '|', ' ', '|', ' '}};
		
	printSpielbrett(Spielbrett);
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Wo moechtest du setzen? (1-9)");
		int pos = scan.nextInt();
			
		System.out.println(pos);

		place (Spielbrett, pos, "player");
		
		
		Random rand = new Random();

		place (Spielbrett, pos, "cpu"); //pos eingabe player = random
		
		
		printSpielbrett(Spielbrett);

	}
	
	
		public static void printSpielbrett(char [][] Spielbrett ) {
		for(char [] row: Spielbrett) {
			for(char c : row) {
				System.out.print(c);

			}
			System.out.println();
			
	}

}
		public static void place(char[][] Spielbrett, int pos, String user) {


			//owner of X and O
			char symbol = ' ';
			
			if(user.equals("player")) {
				symbol = 'X';
				
			} else if(user.equals("cpu")) {
				symbol = 'O';
			} 

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
	

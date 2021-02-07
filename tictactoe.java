import java.util.ArrayList; //for testGewinner
import java.util.List;
import java.util.Arrays;
import java.util.Random; //pos for cpu
import java.util.Scanner; //pos for player

public class progmeth {

	static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		char[][] Spielbrett = {{' ', '|', ' ', '|', ' '}, 
	               {'-', '+', '-', '+', '-'},
	               {' ', '|', ' ', '|', ' '}, 
	               {'-', '+', '-', '+', '-'}, 
	               {' ', '|', ' ', '|', ' '}};
		
	printSpielbrett(Spielbrett);
			
		while(true) {  //cpu braucht anweisung f�r n�chsten zug
			Scanner scan = new Scanner(System.in);
			System.out.println("Wo moechtest du setzen? (1-9)");//scanner muss in while schleife
			int playerPos = scan.nextInt(); //playerpos //cpupos
			

			place (Spielbrett, playerPos, "player");
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			place (Spielbrett, cpuPos, "cpu"); //pos eingabe player = random
			
			printSpielbrett(Spielbrett);

		}
		
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
					Spielbrett[0][0] = symbol;
					break;
				case 2: 
					Spielbrett[0][2] = symbol;
					break;
				case 3: 
					Spielbrett[0][4] = symbol;
					break;
				case 4: 
					Spielbrett[2][0] = symbol;
					break;
				case 5: 
					Spielbrett[2][2] = symbol;
					break;
				case 6: 
					Spielbrett[2][4] = symbol;
					break;
				case 7: 
					Spielbrett[4][0] = symbol;
					break;
				case 8: 
					Spielbrett[4][2] = symbol;
					break;
				case 9: 
					Spielbrett[4][4] = symbol;
					break;
				default: 
					break;
			    }


		}
		public static String testGewinner() {
			
			List topRow   = Arrays.asList(1, 2, 3);
	        List midRow   = Arrays.asList(4, 5, 6);
	        List botRow   = Arrays.asList(7, 8, 9);
	        List leftCol  = Arrays.asList(1, 4, 7);
	        List midCol   = Arrays.asList(2, 5, 8);
	        List rightCol = Arrays.asList(3, 6, 9);
	        List cross1   = Arrays.asList(1, 5, 9);
	        List cross2   = Arrays.asList(7, 5, 3);
			
			List<List> gewonnen = new ArrayList<List>();
	        gewonnen.add(topRow);
	        gewonnen.add(midRow);
	        gewonnen.add(botRow);
	        gewonnen.add(leftCol);
	        gewonnen.add(midCol);
	        gewonnen.add(rightCol);
	        gewonnen.add(cross1);
	        gewonnen.add(cross2);

			for(List l : gewonnen) { 
	        	if (playerPosition.containsAll(l)) { //spieler gewinnt
	        		return "Du hast gewonnen!";
	        	} else if (cpuPosition.containsAll(l)) { //cpu gewinnt
	        		return "Der Computer hat dich geschlagen! Du hast verloren :(";
	        	} else if (playerPosition.size() + cpuPosition.size() == 9) { //unentschieden wenn Spielbrett voll und kein Gewinner
	        		return "Unentschieden!";
	        	}
				
	        }
			

			return"";
		}
			
						
}
	

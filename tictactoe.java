import java.util.Scanner;

public class progmeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			//Ausgabe von dem was eingegeben wurde
			
	}
		
	public static void printSpielbrett(char [][] Spielbrett ) {
		for(char [] row: Spielbrett) {
			for(char c : row) {
				System.out.print(c);

			}
			System.out.println();
				
			
			
			
		}
	}

}

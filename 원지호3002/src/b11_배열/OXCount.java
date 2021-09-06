package b11_¹è¿­;

public class OXCount {
	
	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		// quiz[i][j][k] = (k%2 == 0 -> "O" :"x")
		
		// OXOOOO
		
		for(int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					quiz[i][j][k] = (i+j+k)%2 == 0? "O" : "X";
				}
			}
		}
		
		for(int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]);
				}
				System.out.print(quiz[i].length-1 == j ? "\n" : ", ");
				
				
				
			}
			
		}
	
	
	
	
	
	
	
	}
}

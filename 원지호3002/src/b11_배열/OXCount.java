package b11_�迭;

public class OXCount {
	
	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		int count_O = 0;
		int count_X = 0;
		// quiz[i][j][k] = (k%2 == 0 -> "O" :"x")
		
		// OXOOOO
		
		for(int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					if(quiz[i][j][k].equals("O")) {
						count_O++;
					}else {
						count_X++;
						
					}
					System.out.println(quiz[i][j][k] = (i+j+k)%2 == 0? "O" : "X"; ? "\n":", ");
					
					
					
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
		System.out.println("O�� ����: " + count_O);
		System.out.println("X�� ����: " + count_X
				);
	
	
	
	
	
	
	}
}

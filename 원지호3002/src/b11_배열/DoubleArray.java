package b11_�迭;

public class DoubleArray {
	// ������ �迭
	// ������ �迭�� ���� -> �ڷ���[][];
	
	public static void main(String[] args) {
		
			int [] [] b_arr = new int [3][5];
			
			b_arr[0][0] = 10;
			b_arr[1][4] = 100;
			
			for(int i = 0 ; i < b_arr.length ; i++) {
			
				for(int j = 0; j < b_arr[i].length ; j++) {
					if(b_arr[i][j] != 100) {
						continue;
					}
					System.out.println(b_arr[i][j] ==
							100 ? "[" + i + ", " + j + "]" : "");
					break;
					
					}
				}
			System.out.println(b_arr[0][0]);
			System.out.println(b_arr[2][4]);
	}


}
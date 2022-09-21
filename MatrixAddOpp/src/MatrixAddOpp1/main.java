package MatrixAddOpp1;

public class main {
	public static void main(String[] args) {
		
		//defines the first matrix
		int[][] matrixA = {
				{3, 2, 3},
				{3, 9, 2}
		};
		
		//defines the second matrix
		int[][] matrixB = {
				{2, 7, 3},
				{6, 3, 8}
		};
		
		//sets up the sum matrix
		int[][] sumMatrix;
		
		//defines the first and second row
		int rowA = matrixA.length;
		int rowB = matrixB.length;
		
		//defines the first and second column
		int columnA = matrixA[0].length;
		int columnB = matrixB[0].length;
		
		//defines the size of the sum matrix
		sumMatrix = new int[rowA][columnA];
		
		//sets up boolean to store if it is possible
		boolean pos;
		
		//checks if the first and second matrix are the same size
		if (rowA != rowB || columnA != columnB) {
			System.out.println("The first and second matrix are not the same size.");
			
			//defines the variable that checks if the statement is possible to false
			pos = false;
		}
		else {
			
			//defines the variable that checks if the statement is possibe to true
			pos = true;
			
			//loops through the sum matrix
			for(int i = 0; i <= rowA -1; i++) {
				for(int j = 0; j <= columnA -1; j++) {
					
					//adds the first two matrices to the sum matrix
					sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}
		}
		
		//check if the variable that checks if the statement is possible is true
		if(pos) {
			
				//prints out the product matrix
				for(int m = 0; m <= rowA -1; m++) {
				System.out.print("| ");
					for(int l = 0; l <= columnB -1; l++) {
						System.out.print(sumMatrix[m][l] + " ");
					}
					System.out.println("|");
				}
				System.out.println(rowA + " X " + columnB);
		}
		else {
			
			//prints out the error text
			System.out.println("Was not able to add.");
		}
	}
}

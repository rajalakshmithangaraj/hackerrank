package hackerrank.solution.fibonocci;

public class Fibonocci {
	
	private static int[]  getSeries(int rowNumber) {
		int[][] multi = new int[rowNumber][rowNumber];
		int column = 0;
		for (int row = 0; row < rowNumber; row++) {
			column = 0;
			if (column == 0) {
				multi[row][column] = 1;
				column++;
			}
			while (column <= row) {
				multi[row][column] = multi[row-1][column-1] + multi[row-1][column];
				column++;
			}
		}
		return multi[rowNumber-1];
	}
	
	public static void main(String args[]) {
		int[] fibonocciRow = getSeries(6);
		for (int index=0; index < fibonocciRow.length; index++) {
			System.out.print(fibonocciRow[index] + " ");
		}
	}

}

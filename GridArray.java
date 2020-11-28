//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 10; GridArray
//A standard test case case 10 by 10 array of integer values.
//04-17-2014

public class GridArray {

	public static void main(String[] args) {
		// declare variables
		final int COLUMNS = 10;
		final int ROWS = 10;
		int count = 0;
		int [][] numbers = new int [ROWS][COLUMNS];
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				numbers[row][column] = count;

				count++;

				if (count <= 10)
				{
					// two spaces instead of one…
					System.out.print(numbers[row][column] + "  ");
				}
				else
				{
					System.out.print(numbers[row][column] + " ");
				}

			}

			System.out.println("");
		}
	}
}
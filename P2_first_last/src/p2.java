import java.io.File;
import java.util.Queue;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		readMap("TEST01");
	}
	
	public static void readMap(String filename) {
		
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			
			
			int numRows = scanner.nextInt();
			int numCols = scanner.nextInt();
			int numRooms = scanner.nextInt();
			
			Tile[][][] tiles = new Tile[numRows][numCols][numRooms];
			
			int rowIndex = 0;
			int colsIndex = 0;
			//int roomIndex = 0;
			//process the map!
		 		
		 			while(scanner.hasNextLine()) {
					//grab a line (one row of the map)
		 				String row = scanner.nextLine();
				
		 				if(row.length() > 0) {
		 					for(int i = 0; i < numCols && i < row.length(); i++) {
		 						char element = row.charAt(i);
		 						Tile theTile = new Tile(rowIndex, colsIndex, element);
		 						tiles[rowIndex][i][numRooms] = theTile;
		 						colsIndex++; 
						
		 					}
		 				}
		 				rowIndex++;
		 			}
		 			
		 		
			
			}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
		
		
	}

}

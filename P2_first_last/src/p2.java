import java.io.File;

import java.util.Queue;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		readMap("TEST01");
	}
	
	public static Tile[][][] readMap(String filename) {
		
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			
			
			int numRows = scanner.nextInt();
			int numCols = scanner.nextInt();
			int numRooms = scanner.nextInt();
			
			Tile[][][] tiles = new Tile[numRows][numCols][numRooms];
			
			int rowIndex = 0;
			int colsIndex = 0;
			int roomsIndex = 0;
			//int roomIndex = 0;
			//process the map!
		 		
		 			while(scanner.hasNextLine()) {
					//grab a line (one row of the map)
		 				String row = scanner.nextLine();
				
		 				if(row.length() > 0) {
		 					for(int i = 0; i < numCols && i < row.length(); i++) {
		 						char element = row.charAt(i);
		 						Tile theTile = new Tile(rowIndex, colsIndex, element);
		 						tiles[rowIndex][i][roomsIndex] = theTile;
		 					//	colsIndex++;
		 						
		 						if(element == '|') {
		 							roomsIndex++;
		 							rowIndex = 0;
		 							colsIndex = 0;
		 						}
						
		 					}
		 				} 
		 				rowIndex++;
		 			}
		 			
		 		return tiles;
		 		
			}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return null;
		
	}
	
	public static Tile findStartingPosition(Tile[][][] themTiles) {
		Tile startingPosition = null;
		for(int i = 0; i < themTiles.length; i++) {
			for(int j = 0; j < themTiles[i].length; j++) {
				for(int k = 0; k < themTiles[i][j].length; k++) {
					if(themTiles[i][j][k].equals('W')) {
						startingPosition = themTiles[i][j][k];
					}
				}
			}
		}
		return startingPosition;
	}
	
	public static void queueStartingPoint(Tile[][][] duckTiles) {
		Tile pollySpot = findStartingPosition((readMap("fileName.txt")));
		Queue<Tile> queue = new LinkedList<>();
		queue.add(pollySpot);
		
		for(int i = pollySpot.getRoom(); i < duckTiles.length; i++) {
			for(int j = pollySpot.getCol(); i < duckTiles[i].length; j++) {
				//for()
			}
		}
		
		
		
		
	}
	

}

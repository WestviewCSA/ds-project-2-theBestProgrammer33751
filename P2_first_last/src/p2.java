import java.io.File;


import java.util.Queue;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class p2 {
	static Queue<Tile> queue = new LinkedList();
	static Queue<Tile> visited = new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		readMap("TEST01");
	}
	
	public static Tile[][] readMap(String filename) {
		
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			int numRows = scanner.nextInt();
			int numCols = scanner.nextInt();
			Tile[][] tiles = new Tile[numRows][numCols];
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
		 						Tile theTile = new Tile(rowIndex, colsIndex, i, element);
		 						tiles[rowIndex][i] = theTile;
		 					//	colsIndex++;
						
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
	
	public static Tile findStartingPosition(Tile[][] themTiles) {
		Tile startingPosition = null;
			for(int j = 0; j < themTiles.length; j++) {
				for(int k = 0; k < themTiles[j].length; k++) {
					if(themTiles[j][k].equals('W')) {
						startingPosition = themTiles[j][k];
					}
				}
			}
		
		return startingPosition;
	}
	
	
	public static void dequeueCurrentPosition(Tile[][] duckTiles) {
		Tile curr = findStartingPosition(duckTiles);
		queue.add(curr);
		visited.add(curr);
		
		for(int i = curr.getRow(); i > 0; i--) {
			if(duckTiles[i][curr.getCol()].equals('.')) {
				queue.add(duckTiles[i][curr.getCol()]);
			}
		}
		
		for(int i = curr.getRow(); i < duckTiles.length; i++) {
			if(duckTiles[i][curr.getCol()].equals('.')) {
				queue.add(duckTiles[i][curr.getCol()]);
			
		}
		
		for(int i1 = curr.getCol(); i1 < duckTiles[curr.getCol()].length; i1++) {
			if(duckTiles[curr.getRow()][i1].equals('.')) {
				queue.add(duckTiles[curr.getRow()][i1]);
			}
		}
		
		for(int i1 = curr.getCol(); i1 > 0; i1--) {
			if(duckTiles[curr.getRow()][i1].equals('.')) {
				queue.add(duckTiles[curr.getRow()][i1]);
			}
		}
	}
	
	
		
	
		//while(!queue.isEmpty()) {
			
			//Tile current = queue.poll();
			//if(!current.equals('$')) {
				//visited.add(current);
				
			//}
			
			
		//}
		
		
	
	
	public static void queueSearch(duckTiles[][]) {
		
		while(!queue.isEmpty()) {
			Tile current = current.poll();
			if(duckTiles[current.getRow()][current.getCol()] == '$') {
				break;
			}
		}	
	}
	
}
	

	

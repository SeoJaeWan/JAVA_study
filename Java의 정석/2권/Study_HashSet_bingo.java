package hi2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Study_HashSet_bingo {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		int[][] bingoBoard = new int[5][5];
		
		while(set.size() < 25) {
			set.add((int)(Math.random() * 50) + 1+ "");
		}
		
		Iterator it = set.iterator();
		
		for( int i = 0; i < bingoBoard.length; i++) {
			for( int j = 0; j < bingoBoard[i].length; j++) {
				bingoBoard[i][j] = Integer.parseInt((String) it.next());
				System.out.print((bingoBoard[i][j] < 10 ? "  " : " ") + bingoBoard[i][j]);
			}
			
			System.out.println();
		}
	}
}

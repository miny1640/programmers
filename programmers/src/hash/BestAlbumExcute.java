package hash;

import hash.BestAlbum;

public class BestAlbumExcute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BestAlbum ba = new BestAlbum();
		
		//String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		//int[] plays = {500, 600, 150, 800, 2500};
		//String[] genres = {"classic", "pop", "classic", "classic","jazz","pop", "Rock", "jazz"};
		//int[] plays = {500, 600, 150, 800, 1100, 2500, 100, 1000};
		String[] genres = {"A", "A", "B", "A", "B", "B", "A", "A", "A", "A"};
		int[] plays = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		int[] sol = ba.solution(genres, plays);
		
		for(int i = 0 ; i < sol.length ; i++) {
			if(i > 0) {
				System.out.print(",");
			}
			System.out.print(sol[i]);	//[5, 1, 4, 7, 3, 0, 6]
		}
	}

}

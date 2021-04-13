package hash;

import hash.BestAlbum;

public class BestAlbumExcute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BestAlbum ba = new BestAlbum();
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] sol = ba.solution(genres, plays);
		
		for(int i = 0 ; i < sol.length ; i++) {
			if(i > 0) {
				System.out.print(",");
			}
			System.out.print(sol[i]);	//[4, 1, 3, 0]
		}
	}

}

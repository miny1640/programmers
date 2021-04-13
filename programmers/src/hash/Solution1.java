package hash;

import hash.Solution;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		
		String[] genres = {"A", "A", "B", "A", "B", "B", "A", "A", "A", "A"};
		int[] plays = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int[] answer = sol.solution(genres, plays);
		
		for(int i = 0 ; i < answer.length ; i++) {
			if(i > 0) {
				System.out.print(",");
			}
			System.out.print(answer[i]);	//[5, 1, 4, 7, 3, 0, 6]
		}
	}

}

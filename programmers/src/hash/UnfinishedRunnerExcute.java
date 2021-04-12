package hash;

import hash.UnfinishedRunner;

public class UnfinishedRunnerExcute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnfinishedRunner ur = new UnfinishedRunner();
		
		String[][] participant = {{"leo", "kiki", "eden"},{"marina", "josipa", "nikola", "vinko", "filipa"},{"mislav", "stanko", "mislav", "ana"}};
		String[][] completion = {{"eden", "kiki"},{"josipa", "filipa", "marina", "nikola"},{"stanko", "ana", "mislav"}};
		
		for(int i = 0 ; i < participant.length ; i++) {
			System.out.println(ur.solution(participant[i], completion[i]));
		}

	}

}

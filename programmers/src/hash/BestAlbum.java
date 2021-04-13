package hash;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> genrePlay = new HashMap<String, Integer>();
        ArrayList<String> genreList = new ArrayList<String>();
        ArrayList<Integer> songRank = new ArrayList<Integer>();
        
        for(int i = 0 ; i < genres.length ; i++) {
        	if(genrePlay.containsKey(genres[i])) {
        		int tmp = genrePlay.get(genres[i]);
        		genrePlay.remove(genres[i]);
        		genrePlay.put(genres[i], tmp + plays[i]);
        	}else {
        		genrePlay.put(genres[i], plays[i]);
        		genreList.add(genres[i]);
        	}
        }
        
        String[] genreRank = new String[genreList.size()];
        
        for(int i = 0 ; i < genreList.size() ; i++) {
        	int rank = 0;
        	for(int j = 0 ; j < genreList.size() ; j++) {
        		if(genrePlay.get(genreList.get(i)) < genrePlay.get(genreList.get(j))) {
        			rank++;
        		}
        	}
        	genreRank[rank] = genreList.get(i);
        }
        
        for(int i = 0 ; i < genreRank.length ; i++) {
        	ArrayList<Integer> songList = new ArrayList<Integer>();
        	for(int j = 0 ; j < genres.length ; j++) {
        		if(genres[j].equals(genreRank[i])) {
        			songList.add(j);
        		}
        	}

    		int max = 0;
    		int topSong = 0;
    		
        	for(int j = 0 ; j < songList.size() ; j++) {
        		if(max < plays[songList.get(j)]) {
        			max = plays[songList.get(j)];
        			topSong = j;
        		}
        	}
        	
        	songRank.add(songList.get(topSong));
        	songList.remove(topSong);
        	
        	max = 0;
        	
        	if(songList.size() > 0) {
            	for(int j = 0 ; j < songList.size() ; j++) {
            		if(max < plays[songList.get(j)]) {
            			max = plays[songList.get(j)];
            			topSong = j;
            		}
            	}

            	songRank.add(songList.get(topSong));
        	}
        }
        
        int[] answer = new int[songRank.size()];
        
        for(int i = 0 ; i < answer.length ; i++) {
        	answer[i] = songRank.get(i);
        }
        
        return answer;
    }
}

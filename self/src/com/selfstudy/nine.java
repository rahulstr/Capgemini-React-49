package com.selfstudy;

public class nine {
	
	public static void main(String[] args) {
		int position=calculateHighScore(1500);
		displayHighScorePosition("rahul",position);
		
	    position=calculateHighScore(900);
		displayHighScorePosition("shardhul",position);
		
		position=calculateHighScore(400);
		displayHighScorePosition("kl rahul",position);
		
		position=calculateHighScore(50);
		displayHighScorePosition("rahul twe",position);
		
		
	}
	
	public static void displayHighScorePosition(String name,int position) {
		
		System.out.println(name+" managed to get into position "+position+"on the high score table");
		
	}
	
	public static int calculateHighScore(int score) {
		
		if (score>1000) {
			return 1;
		}else if(score>500 && score<1000) {
			
			return 2;
		}else if(score>100 && score<500) {
			
			return 3;
		}else {
			
			return 4;
		}
		
		
	}
	
		
}
	
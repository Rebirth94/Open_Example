package portfolio.code.backjoon.step06.p4344;

/* 평균은 넘겠지 (4344) */
/*
 * https://www.acmicpc.net/problem/4344
 */

import java.util.Scanner;
	
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		for(int i=0; i<c; i++) {
			ScoreManager sManager = new ScoreManager(sc.nextInt());
			for(int j=0; j<sManager.getScoreLength(); j++) {
				sManager.addScore(j, sc.nextInt());
			}	
			System.out.printf("%.3f", sManager.getAboveAvePer());
			System.out.println("%");
		}
	}
}

class ScoreManager{
	private final int[] scores;
	
	public ScoreManager(int n) {
		this.scores = new int[n];
	}
	
	public void addScore(int index, int score) {
		this.scores[index] = score; 
	}
	
	public int getScoreLength() {
		return this.scores.length;
	}
	
	public double getAverage() {
		double sum = 0.0;
		for(int score : this.scores) {
			sum += score;
		}
		return sum / scores.length;
	}
	
	public double getAboveAvePer() {
		double ave = getAverage();
		int aboveCnt = 0;
		for(int score : this.scores) {
			if(ave < score) {
				aboveCnt++;
			}
		}
		double abovePer = (100.0/scores.length) * aboveCnt;
		return (double) (Math.round(abovePer*1000) / 1000.0);
	}
}
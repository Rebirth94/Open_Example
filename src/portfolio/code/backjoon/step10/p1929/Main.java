package portfolio.code.backjoon.step10.p1929;

/* 소수 구하기 (1929) */
/*
 * https://www.acmicpc.net/problem/1929
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		DecimalChecker dCk = new DecimalChecker(sc.nextInt(), sc.nextInt());
		
		for(int i=dCk.getStart(); i<=dCk.getEnd(); i++) {
			if(dCk.isDecimal(i) == true) {
				System.out.println(i);
			}
		}
	}
}

class DecimalChecker{
	private final int start, end;
	private final boolean[] isDecimal;
	
	public DecimalChecker(int start, int end) {
		this.start = start;
		this.end = end;
		this.isDecimal = initDecimal(end);
	}
	public int getStart() {return this.start;}
	public int getEnd() {return this.end;}
	
	private boolean[] initDecimal(int end) {
		boolean[] isDecimal=new boolean[end+1], tempMark= new boolean[end+1];
		for(int i=2; i<=this.end; i++) {		
			if(tempMark[i] == false) {
				isDecimal[i] = true;
				
				int j = i;
				do {
					tempMark[j] = true;
					j += i;
				} while (j <= this.end);
			}
			
		}
		return isDecimal;
	}
	
	public boolean isDecimal(int num) {
		return this.isDecimal[num];
	}
}

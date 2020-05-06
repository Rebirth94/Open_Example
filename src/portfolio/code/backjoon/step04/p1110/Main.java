package portfolio.code.backjoon.step04.p1110;

/* 더하기 사이클 (1110) */
/*
 * https://www.acmicpc.net/problem/1110
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PlusCycle p = new PlusCycle(sc.nextInt());
		do {
			p.cycle();
		}while(p.isContinue());
		System.out.println(p.getLength());
	}
}

class PlusCycle{
	private final int n;
	private int length, temp;
	
	public PlusCycle(int n) {
		this.n = (n >= 10) ? n : n*10; 
		this.temp = this.n;
	}
	
	public void cycle() {
		this.temp = getNewTemp();
		this.length++;
	}
	
	private int getNewTemp() {
		int tempSum = getSum(this.temp);
		return getCombine(this.temp, tempSum);
	}
	
	private int getSum(int v) {
		int leftNum = Integer.valueOf( getLeftNum(v) );
		int rightNum = Integer.valueOf( getRightNum(v) );
		return leftNum + rightNum;
	}
	
	private int getCombine(int left, int right) {
		return Integer.valueOf( getRightNum(left) + getRightNum(right) );
	}
	
	private String getLeftNum(int v) {
		String strTemp = String.valueOf(v);
		return (strTemp.length() == 1) ? "0" : String.valueOf( String.valueOf(v).charAt(0) );
	}
	
	private String getRightNum(int v) {
		String strTemp = String.valueOf(v);
		int index = (strTemp.length() == 1) ? 0 : 1;
		return String.valueOf( strTemp.charAt(index) );
	}
	
	public boolean isContinue() {
		return this.n != this.temp;
	}
	
	public int getLength() {
		return this.length;
	}
}

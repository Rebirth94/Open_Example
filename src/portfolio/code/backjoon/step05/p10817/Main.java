package portfolio.code.backjoon.step05.p10817;

/* 세 수 (10817) */
/*
 * https://www.acmicpc.net/problem/10817
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] values = new int[3];
		for(int i=0; i<values.length; i++) {
			values[i] = sc.nextInt();
		}
		
		int index = 0, temp = 0;
		for(int i=0; i<values.length; i++) {
			index = (temp < values[i]) ? i : index;
			temp = (temp < values[i]) ? values[i] : temp;
		}
		values[index] = 0;
		
		temp = 0;
		for(int v : values) {
			temp = (temp < v) ? v : temp;
		}
		System.out.println(temp);
	}
}

package portfolio.code.backjoon.step07.p1065;

/* 한수(1065) */
/*
 * https://www.acmicpc.net/problem/1065
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		NumberChecker nC = new NumberChecker();
		int input = new Scanner(System.in).nextInt(), count=0;
		
		for(int i=1; i<=input; i++) {
			if(nC.isApCheck(i) == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}

class NumberChecker{
	public boolean isApCheck(int input) {
		String strNum = String.valueOf(input);
		
		if(strNum.length() == 1 || strNum.length() == 2) {
			return true;
		}	
		int difference = strNum.charAt(1) - strNum.charAt(0);
		
		Integer preTemp = null;
		for(char v : strNum.toCharArray()) {
			if(preTemp == null) {
				preTemp = (int) v;
				continue;
			}
			
			if((v - preTemp) == difference) {
				preTemp = (int) v;
			} else {
				return false;
			}
		}
		return true;
	}
}

package portfolio.code.backjoon.step08.p1152;

/* 단어의 개수 (1152) */
/*
 * https://www.acmicpc.net/problem/1152
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		String input = new Scanner(System.in).nextLine();
		
		int count = input.split(" ").length;
		if(input.charAt(0) == ' ') {
			count--;
			if(count == -1) {
				count = 0;
			}
		}

		System.out.println(count);
	}
}

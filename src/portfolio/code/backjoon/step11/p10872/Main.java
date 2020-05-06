package portfolio.code.backjoon.step11.p10872;

/* 팩토리얼 (10872) */
/*
 * https://www.acmicpc.net/problem/10872
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		System.out.println(factorial(new Scanner(System.in).nextInt()));
	}
	
	private static int factorial(int n) {
		return (n<=1) ? 1 : n*factorial(--n);
	}
}

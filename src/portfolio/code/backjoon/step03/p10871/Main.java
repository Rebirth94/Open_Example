package portfolio.code.backjoon.step03.p10871;

/* X보다 작은 수 (10871) */
/*
 * https://www.acmicpc.net/problem/10871
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,x,v;
		n = sc.nextInt();
		x = sc.nextInt();
		for(int i=0; i<n; i++) {
			v = sc.nextInt();
			if(v < x) {
				System.out.print(v + " ");
			}
		}
	}
}

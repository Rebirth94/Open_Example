package portfolio.code.backjoon.step09.p1712;

/* 손익분기점 (1712) */
/*
 * https://www.acmicpc.net/problem/1712
 */

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Corp corp = new Corp(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println(corp.breakeven());
	}
}

class Corp{
	private final int fCost, pCost, price;
	
	public Corp(int fixedCost, int productionCost, int price) {
		this.fCost = fixedCost;
		this.pCost = productionCost;
		this.price = price;
	}
	
	public int breakeven() {
		int profit=price-pCost;
		if(profit <= 0) {
			return -1;
		}
		return (fCost/profit)+1;
	}
}

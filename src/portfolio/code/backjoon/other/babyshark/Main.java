package portfolio.code.backjoon.other.babyshark;

/* 아기 상어 (16236) */
/*
 * https://www.acmicpc.net/problem/16236
 */
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Loc startLoc = null;
		int mapSize = sc.nextInt();
		int[][] exMap = new int[mapSize][mapSize];
		
		for(int row=0; row<mapSize; row++) {
			for(int col=0; col<mapSize; col++) {
				exMap[col][row] = sc.nextInt();
				if(exMap[col][row] == MapState.BABY_SHARK.getIntValue()) {
					startLoc = new Loc(col, row);
				}
			}
		}
		
		BabyShark babyShark = new BabyShark(startLoc);
		while (babyShark.isFind(exMap) == true) {
			babyShark.eat();
		}
		System.out.println(babyShark.getMoveCnt());
	}
}

enum MapState{
	EMPTY(0), BABY_SHARK(9);
	private final int intValue;
	MapState(int intValue) {this.intValue = intValue;}
	public int getIntValue() {return intValue;}
}
enum Direction{
	UP(0,-1), LEFT(-1,0), RIGHT(1,0), DOWN(0,1);
	private final Loc loc;
	private Direction(int col, int row) {
		this.loc = new Loc(col, row);
	}
	public Loc getLoc() {return this.loc;}
}

class BabyShark{
	private int level=2, exp=0, moveCnt=0;
	private Loc curLoc;

	public BabyShark(Loc startLoc) {
		this.curLoc = startLoc;
	}

	public int getMoveCnt() {return moveCnt;}
	
	private void upExp() {
		this.exp++;
		if(this.exp >= this.level) {upLevel();}
	}
	
	private void upLevel() {
		this.level++;
		this.exp=0;
	}
	
	public void eat() {
		upExp();
	}
	
	public boolean isFind(int[][] exMap) {
		boolean[][] isVisit = new boolean[exMap.length][exMap.length];
		PriorityQueue<Loc> targetLocs = new PriorityQueue<>();
		int fishValue, distance=0;
		
		Queue<Loc> q = new LinkedList<>();
		q.add(this.curLoc);

		while(q.isEmpty() == false) {	
			int qSize = q.size();
			
			for(int i=0; i<qSize; i++) {
				Loc node = q.poll();
				
				if(isVisit[node.getCol()][node.getRow()] == true) {
					continue;
				}
				isVisit[node.getCol()][node.getRow()] = true;
				
				fishValue = exMap[node.getCol()][node.getRow()];
				if(MapState.EMPTY.getIntValue() != fishValue && this.level > fishValue) {
					targetLocs.offer(node);	
				}

				for(Direction d : Direction.values()) {
					int nextCol = node.getCol() + d.getLoc().getCol();
					int nextRow = node.getRow() + d.getLoc().getRow();
					
					if(nextCol < 0 || nextRow < 0 || nextCol >= exMap.length || nextRow >= exMap.length) {	
						continue;
					}
					
					if(MapState.BABY_SHARK.getIntValue() == fishValue || this.level >= fishValue) {
						q.add(new Loc(nextCol, nextRow));
					}
				}
			}
			
			if(targetLocs.isEmpty() == false) {
				Loc moveLoc = targetLocs.poll();
				exMap[curLoc.getCol()][curLoc.getRow()] = MapState.EMPTY.getIntValue();
				exMap[moveLoc.getCol()][moveLoc.getRow()] = MapState.BABY_SHARK.getIntValue();
				this.curLoc = moveLoc;
				this.moveCnt += distance;
				return true;
			}
			distance++;
		}
		return false;
	}
}

class Loc implements Comparable<Loc>{
	private final int col, row;
	public Loc(int col, int row) {
		this.col = col;
		this.row = row;
	}
	public int getCol() {return this.col;}
	public int getRow() {return this.row;}
	@Override
	public int compareTo(Loc o) {
		if(getRow() == o.getRow()) { 
			return Integer.compare(getCol(), o.getCol());
		};
		return Integer.compare(getRow(), o.getRow());
	}
}
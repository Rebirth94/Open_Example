package portfolio.designpattern.gof.structural.flyweight;

import java.util.ArrayList;

import portfolio.designpattern.gof.structural.flyweight.npc.Npc;
import portfolio.designpattern.gof.structural.flyweight.npc.factory.FlyweightNpcFactory;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcGender;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcType;
import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightNormalManNpc;

/**
 * 플라이웨이트 패턴
 * 
 * 플라이웨이트 패턴에서 사용하는 객체
 * Flyweight : 공통적인 데이터 객체들의 인터페이스를 제공
 * ConctreteFlyweight : Flyweight를 구현한 공통적으로 적용되는 데이터 객체
 * FlyweightFactory : ConctreteFlyweight들을 가지고 있으며 없으면 생성하여 리턴해주는 객체 
 * UnsharedConctreteFlyweight : 공유하지 않는 데이터를 포함한 객체로 최종적으로 사용할 객체이다
 * 								FlyweightFactory에서 받은 ConctreteFlyweight를 멤버변수로 가지고 사용한다. (객체 합성)
 */

public class FlyweightClient {
	
	private static int tempMemoySize = 0;
	
	public static void addTempMemory(int size) {
		tempMemoySize += size;
	}
	
	private static void printTempMemorySize() {
		System.out.println("[그래픽에 사용된 메모리 : " + tempMemoySize + " Kbyte] \n");
	}
	
	public static void main(String[] args) {
		printTempMemorySize();		

//		flyweightNotUseCase();
		flyweightUseCase();

		printTempMemorySize();
	}
	
	// 플라이웨이트 미사용
	private static void flyweightNotUseCase() {
		ArrayList<Npc> npcList = new ArrayList<>();
		for(int i=0; i<100; i++) {
			npcList.add( new Npc(new FlyweightNormalManNpc(), "주민"+(i+1), i, i) );
			System.out.println(npcList.get(i) + "\n");
		}
		System.out.println("[총 생성된 NPC : " + npcList.size() + "]");
	}
	
	// 플라이웨이트 사용
	private static void flyweightUseCase() {
		FlyweightNpcFactory npcFactory = FlyweightNpcFactory.getInstance();
				
		System.out.println("/****************/\n/*남자주민 배치*/");
		ArrayList<Npc> npcNormalManList = new ArrayList<>();
		for(int i=0; i<30; i++) {
			npcNormalManList.add(new Npc(npcFactory.getFlyweightNpc(NpcGender.MAN, NpcType.NORMAL), "주민"+(i+1), i, i) );
			System.out.println( npcNormalManList.get(i) + "\n" );
		}
		
		System.out.println("/****************/\n/*여자주민 배치*/");
		int tempCount = npcNormalManList.size();
		ArrayList<Npc> npcNormalWomanList = new ArrayList<>();
		for(int i=0; i<20; i++) {
			npcNormalWomanList.add(new Npc(npcFactory.getFlyweightNpc(NpcGender.WOMAN, NpcType.NORMAL), "주민"+(i+1+tempCount), i+tempCount, i+tempCount) );
			System.out.println( npcNormalWomanList.get(i) + "\n" );
		}

		System.out.println("/**************/\n/*경비원 배치*/");
		ArrayList<Npc> npcSecurityManList = new ArrayList<>();
		for(int i=0; i<50; i++) {
			npcSecurityManList.add(new Npc(npcFactory.getFlyweightNpc(NpcGender.MAN, NpcType.SECURITY), "경비원"+(i+1), i, i) );
			System.out.println( npcSecurityManList.get(i) + "\n" );
		}
		
		System.out.println("[생성된 남자주민 : " + npcNormalManList.size() + "]");
		System.out.println("[생성된 여자주민 : " + npcNormalWomanList.size() + "]");
		System.out.println("[생성된 경비원 : " + npcSecurityManList.size() + "]\n");
		
		final int totalNpc = npcNormalManList.size() + npcNormalWomanList.size() + npcSecurityManList.size();
		System.out.println("[총 생성된 NPC : " + totalNpc + "]");
	}
}



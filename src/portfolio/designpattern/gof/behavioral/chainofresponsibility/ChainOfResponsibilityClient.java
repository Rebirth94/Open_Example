package portfolio.designpattern.gof.behavioral.chainofresponsibility;

import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Boss;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Harpy;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Orc;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Skeleton;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.monster.Vampire;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation.Archer;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation.Assassin;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation.Occupation;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation.Warrior;
import portfolio.designpattern.gof.behavioral.chainofresponsibility.occupation.Wizard;

/**
 * 책임연쇄 패턴
 * 어떠한 요청을 처리하기 위한 객체를 체인 사슬처럼 여러개 연결하여 처리하는 패턴으로
 * 각 객체는 자신의 책임만큼 처리한 뒤 처리 할 수 없으면 다음 객체로 책임을 넘긴다
 * 단순하게 보면 클라이언트에서 if 없는 if (빠른 return 스타일) 처럼 볼 수도 있다.
 * 
 * 게임의 던전을 예로 들어보자
 */
public class ChainOfResponsibilityClient {
	public static void main(String[] args) {
		Occupation warrior = new Warrior();
		Occupation archer = new Archer();
		Occupation assassin = new Assassin();
		Occupation wizard = new Wizard();
		
		showRule();
		
		warrior.setNextHunter(archer);
		archer.setNextHunter(assassin);
		assassin.setNextHunter(wizard);
		
		warrior.hunting(new Skeleton());
		System.out.println();
		warrior.hunting(new Harpy());
		System.out.println();
		warrior.hunting(new Vampire());
		System.out.println();
		warrior.hunting(new Orc());

		System.out.println();
		if(warrior.hunting(new Boss()) == false) {
			System.out.println("파티가 전멸했습니다.");
		}
		
		
	}
	
	private static void showRule() {
		System.out.println("[던전 몬스터 특징 및 약점 직업 설정]");
		System.out.println("스켈레톤 : 장거리 공격을 잘 피하여 근거리 전사를  추천");
		System.out.println("하피 : 날아다니는 특성으로 원거리로 잡아야하나 마법 면역이 있어 궁수를 추천");
		System.out.println("뱀파이어 : 힘이 쎄고 마법에 면역이 있으므로 몰래 뒤에서 한 방을 노리는 암살자를 추천");
		System.out.println("오우거 : 물리적인 공격은 소용 없으나 마법에 취약하여 마법사를 추천\n");
	}
}

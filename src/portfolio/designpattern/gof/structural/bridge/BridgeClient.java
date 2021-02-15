package portfolio.designpattern.gof.structural.bridge;

import portfolio.designpattern.gof.structural.bridge.avatar.BridgeArcher;
import portfolio.designpattern.gof.structural.bridge.avatar.BridgeOccupation;
import portfolio.designpattern.gof.structural.bridge.avatar.BridgeWarrior;
import portfolio.designpattern.gof.structural.bridge.weapon.BridgeBow;
import portfolio.designpattern.gof.structural.bridge.weapon.BridgeSword;

/**
 * 브릿지 패턴
 * 
 * 브릿지 패턴에서 사용하는 객체
 * Implementor : 구현을 담당하는 객체의 인터페이스를 제공
 * ConcreteImplementor : Implementor를 구현한 실제 구현 객체
 * Abstraction : 기능을 담당하며 Implementor를 멤버변수(브릿지)로 가지고 사용하는 객체
 * RefinedAbstraction : Abstraction을 상속받아 사용하며 기능을 추가한 객체
 * */

public class BridgeClient {
	public static void main(String[] args) {
		BridgeOccupation warrior = new BridgeWarrior();
		warrior.setWeapon(new BridgeSword());
		
		warrior.attack();
		warrior.skill();
		
		System.out.println("**************************************************\n");
		
		BridgeOccupation archer = new BridgeArcher();
		archer.setWeapon(new BridgeBow());
		
		archer.attack();
		archer.skill();
	}

}

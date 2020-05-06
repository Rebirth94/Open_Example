package portfolio.designpattern.gof.creational.factory;

import java.util.Scanner;

import portfolio.designpattern.gof.creational.factory.factory.WeaponSmithy;
import portfolio.designpattern.gof.creational.factory.weapons.Weapons;

/**
 * 팩토리 메서드 패턴
 * 클래스를 생성하는 클래스를 만들어 객체 생성의 책임을 분리하는 패턴으로
 * 팩토리 이름대로 객체를 생성하는 공장이라고 생각해면 된다
 * 
 * 팩토리 패턴을 사용하지 않으면 메인 로직에서 분기하여 객체를 생성해야 하므로
 * 코드가 난잡해지고 흐름제어 이외의 책임을 추가로 가지게 된다 (단일 책임 원칙 위반)
 * 
 * 객체 생성의 책임을 분리하기 위해 Factory 클래스를 생성하고 생성의 책임을 전담한다
 * 이로인해 메인 로직에서는 각 구현 클래스에 대한 의존성도 제거 할 수있으며,
 * 구현 클래스를 모르더라도 추상화 타입으로 유연한 코드를 작성 할 수있다.
 * 
 * 게임을 예로들어 무기를 제작한다고 생각하고
 * 대장간에서 제작 가능한 아이템 리스트를 아래와 같이 가정 해보자
 * [제작 무기]
 * 1.검
 * 2.활
 * 3.지팡이
 */
public class FactoryClient {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		WeaponSmithy wSmithy= new WeaponSmithy();
		System.out.println("[검, 활, 지팡이]");
		System.out.print("제작 할 무기 : ");
		String input = sc.next();
		
		Weapons weapon = wSmithy.createWeapon(input);
		weapon.make();
	}
}

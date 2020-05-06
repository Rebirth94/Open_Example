package portfolio.designpattern.gof.creational.factory;

import java.util.Scanner;

import portfolio.designpattern.gof.creational.factory.factory.WeaponSmithy;
import portfolio.designpattern.gof.creational.factory.weapons.Weapons;

/**
 * 팩토리 메소드 패턴
 * 클래스를 생성하는 클래스를 만들어 객체 생성의 책임을 분리하는 패턴으로
 * 팩토리 이름대로 객체를 생성하는 함수라고 생각해면 된다
 * 
 * 팩토리 패턴을 사용하지 않으면 메인 로직에서 분기하여 객체를 생성해야 하므로
 * 코드가 난잡해지고 흐름제어 이외의 책임을 추가로 가지게 된다 (단일 책임 원칙 위반)
 * 
 * 팩토리 메소드 패턴에서 사용하는 객체
 * Product : 생성 할 대상 객체
 * Factory : Product객체 생성의 책임을 담당 할 객체
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

public class FactoryMethodClient {
	
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

/**
 * 스캐너로 문자열을 입력받아서 만들 무기를 선택하여 무기 객체를 생성하고
 * 생성된 객체가 무엇일진 모르지만 make() 함수로 제작을 한다.
 * 
 * 이렇게 코드를 사용하는 클라이언트의 입장에서
 * 런타임에서 변경된 값으로 생성될 객체가 무엇일지 몰라도
 * 팩토리 패턴으로 생성된 객체로 처리가 가능하다.
 * 
 * 새로운 무기가 추가되더라도
 * 흐름을 제어하는 메인 코드는 수정하지 않고
 * 객체를 생성하는 팩토리 클래스만을 수정하면 된다.
 */
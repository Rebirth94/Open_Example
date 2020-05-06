package portfolio.designpattern.gof.behavioral.iterator;

import portfolio.designpattern.gof.behavioral.iterator.aggregate.CharacterSlot;
import portfolio.designpattern.gof.behavioral.iterator.characters.Archer;
import portfolio.designpattern.gof.behavioral.iterator.characters.GameCharacter;
import portfolio.designpattern.gof.behavioral.iterator.characters.Warrior;
import portfolio.designpattern.gof.behavioral.iterator.characters.Wizard;
import portfolio.designpattern.gof.behavioral.iterator.iterator.IExampleIterator;

/**
 * 반복자 패턴
 * 기반이 되는 표현을 노출시키지 않고 연속적으로 객체 요소에 접근하는 방법으로
 * 일반적인 반복문을 두고 반복자 패턴을 사용하는 이유는
 * 반복문을 사용 할 때 내용(원소 타입)에 의존하지 않고 사용 할 수 있기 때문이다
 * 
 * 패턴의 구조에서 Aggregate, Iterator 두 가지 인터페이스를 확인 할 수 있는데
 * Aggregate는 집합, 모으다 같은 의미로 특정 객체에 데이터가 모여있고
 * 반복할 대상을 Iterator 인터페이스로 반복 할 수 있도록 객체를 생성하는 역할이다.
 * Iterator는 단순히 대상을 반복하는 역할이다.
 * 
 * 사실 자바에서는 특별히 구현 할 일이 없는 패턴이긴 하다
 * 자바에서 유틸로 제공되는 Collection 인터페이스를 확장 및 구현한
 * List, Set<E> 등 인터페이스의 구현체들이 Aggregate의 역할로서 구현되어 있으며,
 * 
 * Iterator 인터페이스 및 콘크리트 클래스가 다 구현되어있다
 * Iterator<E>, ListIterator<E>와  같이 제네릭으로 구현되어 있고
 * ListIterator<E> 클래스는 obj.previous() 같은 함수로 역순 순회 까지도 구현되어 있다. 
 * 
 * 게다가 자바5부터 지원하는 for each 문은 컴파일러가 바이트 코드로 번역 할 시에
 * Iterator로 치환하여 번역하여 내부적으로 반복자 패턴을 구현한 간단한 문법이라고 생각하면 된다
 * for(원소타입 변수명 : 순회대상 콜렉션) 으로 간단히 사용 할 수 있다.
 * 
 * 그래도 일단 간단한 예제로 반복자 패턴을 구현 해보자
 * 게임을 켰을 때 캐릭터 선택창에서 캐릭터가 나열되는 것을 가정해본다.
 */

public class IteratorClient {
	public static void main(String[] args) {
		CharacterSlot charSlot = new CharacterSlot();
	
		charSlot.add(new Warrior("캐릭터1"));
		charSlot.add(new Archer("캐릭터2"));
		charSlot.add(new Wizard("캐릭터3"));
		charSlot.add(new Wizard("캐릭터4"));
		charSlot.add(new Warrior("캐릭터5"));
		
		IExampleIterator iterator = charSlot.iterator();
		
		System.out.println("[캐릭터 목록]");
		while (iterator.hasNext()) {
			GameCharacter gChar = (GameCharacter) iterator.next();
			System.out.print("직업 : " + gChar.getOccupation() + ", ");
			System.out.println("닉네임 : " + gChar.getNickName());
		}
	}
}

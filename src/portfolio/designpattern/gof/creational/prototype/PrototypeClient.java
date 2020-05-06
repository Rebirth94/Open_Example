package portfolio.designpattern.gof.creational.prototype;

import portfolio.designpattern.gof.creational.prototype.monster.Skeleton;

/**
 * 프로토타입 패턴
 * 원래의 형태, 원형이라는 뜻으로 현재 객체 상태를 그대로 복사하여 생성하는 패턴이다.
 * 
 * 프로토타입의 개념을 보려면 복사의 형태를 먼저 알아야한다
 * 복사의 형태는 얕은복사와 깊은 복사가 있으며 둘의 차이를 보려면 메모리를 알아야한다
 * 간단히 줄여도 길어질 것 같지만 최대한 요약해서 알아보자
 * 
 * 우선 우리가 코딩하는 모든 것은 메모리에 적재되며 각 구역별로 크게 3가지로 정리하여 관리한다
 * 메소드(스태틱)메모리 영역, 스택 메모리 영역, 힙 메모리 영역
 * 이 중에서 복사의 형태를 알아보려면 스택과 힙 두 영역을 알아야한다.
 * 
 * 스택 메모리 영역
 * 간단히 보면 흐름제어가되는 공간이라고 보면 될 것 같다.
 * 코드에서 함수가 호출되거나 새로운 블록(if문이나 for문 등 중괄호)이 생기면
 * 스택 메모리에 적재되며 후입선출 특징에 맞춰서 처리되고 메모리에서 해제 된다.
 * 
 * 힙 메모리 영역
 * 동적으로 메모리에 할당되는 데이터가 지속적으로 저장되어있는 영역이다
 * 자바는 포인터를 JVM이 관리하여 간접적으로 존재하는데 객체의 주소 값이 그것이다
 * 스택 영역에서의 참조자료형 변수는 힙 메모리 위치(주소)를 가르킬 뿐이다
 * 모든 객체는 힙 메모리에 실제하며 때문에 얕은 복사와 깊은 복사의 차이가 생긴다.
 * 
 * 얕은 복사(Shallow Copy)
 * 스택 메모리의 레퍼런스 타입의 변수가 가르키는 힙 메모리의 객체 주소(실제 데이터 위치)를
 * 캐스팅 가능한 타입의 다른 변수에 대입하여 복사하는 것으로
 * 단순히 두 변수가 하나의 같은 힙 메모리의 객체 주소를 가르키케 만든다.
 * 
 * 깊은 복사(Deep Copy)
 * 힙 메모리 영역의 데이터 자체를 복사하여 똑같은 값을 가지는 객체를
 * 메모리의 새로운 위치에 새로운 주소를 할당받아서 만드는  것이다.
 * 
 * 프로토타입 패턴은 깊은 복사를 이용하여 객체를 복제하여 생성하는 패턴으로
 * 객체 생성의 비용이 클 때(생성시 DB연결이 필요한 경우) 유용한 패턴이다.
 * 
 */

public class PrototypeClient {
	public static void main(String[] args) {
		Skeleton skeleton1 = new Skeleton(10, "기본 무기", "기본 갑옷");
		Skeleton skeleton2 = skeleton1;
		Skeleton skeleton3 = null;
		try {
			skeleton3 = (Skeleton) skeleton1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		skeleton1.setLevel(20);
		skeleton1.setWeapon("뼈다귀");
		
		System.out.println(skeleton1.toString());
		System.out.println(skeleton2.toString());
		System.out.println(skeleton3.toString());
	}
}

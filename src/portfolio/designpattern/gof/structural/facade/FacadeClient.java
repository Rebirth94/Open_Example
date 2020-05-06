package portfolio.designpattern.gof.structural.facade;

import portfolio.designpattern.gof.structural.facade.warrior.Warrior;

/**
 * 퍼사드 패턴
 * 건물의 정면, 외관 이라는 뜻의 퍼사드 패턴은
 * 여러 API의 집합을 하나의 API로 묶어서 간단하게 사용 할 수 있게 해주는 방법이다.
 * 
 * 일련의 과정을 하나의 API로 사용함으로 코드의 가독성을 올릴 수 있으며
 * 퍼사드 객체만을 참조하여 꼭 알지 않아도 되는 객체의 참조를 줄일 수 있다
 * 코드의 유연성을 높이며 디자인 원칙중 최소 지식 원칙을 지킬 수 있게 된다.
 * 
 * 예시로 일상모드와 전투모드가 있는 게임의 전사 캐릭터가
 * 전투 준비하는 과정을 퍼사드 패턴으로 확인 해보자
 *  
 * 전투 준비 과정은 다음과 같다고 가정하자
 * 방어구 장착 -> 무기 장착 -> 방패 장착 -> 회복물약 사용 -> 버프스킬1,2 사용
 */

public class FacadeClient {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		warrior.setCombatMode();
	}
}

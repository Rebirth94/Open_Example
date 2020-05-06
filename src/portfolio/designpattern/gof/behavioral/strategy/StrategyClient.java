package portfolio.designpattern.gof.behavioral.strategy;

import portfolio.designpattern.gof.behavioral.strategy.strategy.StrategyArcher;
import portfolio.designpattern.gof.behavioral.strategy.strategy.StrategyOccupation;
import portfolio.designpattern.gof.behavioral.strategy.strategy.StrategyWarrior;

/**
 * 전략 패턴 (Strategy)
 * 
 * 
 * 전략 패턴에서 사용하는 객체
 * Strategy : 인터페이스로 동작할 추상적인 함수를 표현한다.
 * ConcreteStrategy : Strategy 인터페이스를 구현한 객체로
 * 					    런타임에서 상황에 맞는 구현 객체로 바꿔 사용 할 수 있다.
 * 
 * 예시로 게임에서 캐릭터의 공격을 처리하는데 캐릭터의 직업을 먼저 알 수 없을 때
 * 런타임에서 캐릭터의 직업을 결정해서 처리한다고 하는 경우를 확인해보자
 */

public class StrategyClient {
	public static void main(String[] args) {
		StrategyOccupation occupation;
		
		occupation = new StrategyWarrior();
		occupation.attack();
		
		occupation = new StrategyArcher();
		occupation.attack();
	}
}

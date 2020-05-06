package portfolio.designpattern.gof.behavioral.strategy.strategy;

public class StrategyArcher implements StrategyOccupation {

	@Override
	public void attack() {
		System.out.println("궁수 공격");		
	}
	
}

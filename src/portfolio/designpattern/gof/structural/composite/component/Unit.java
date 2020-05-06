package portfolio.designpattern.gof.structural.composite.component;

import portfolio.designpattern.gof.structural.composite.unit.UnitOccupation;

public class Unit implements Units {

	private final UnitOccupation unit;
	
	public Unit(UnitOccupation unit) {
		this.unit = unit;
	}
	
	@Override
	public void attack() {
		System.out.print(unit.getOccupation() + " ");
		System.out.print(unit.getNickName() + " 이(가)");
		System.out.println("공격합니다.");
	}

}

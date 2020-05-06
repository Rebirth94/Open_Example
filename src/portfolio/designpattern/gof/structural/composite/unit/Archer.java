package portfolio.designpattern.gof.structural.composite.unit;

public class Archer extends UnitOccupation {
	public Archer(String nickName) {
		super(nickName);
	}
	
	@Override
	public String getOccupation() {
		return "궁수";
	}
}

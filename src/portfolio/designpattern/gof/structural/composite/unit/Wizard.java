package portfolio.designpattern.gof.structural.composite.unit;

public class Wizard extends UnitOccupation {
	public Wizard(String nickName) {
		super(nickName);
	}
	
	@Override
	public String getOccupation() {
		return "마법사";
	}
}

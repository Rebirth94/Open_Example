package portfolio.designpattern.gof.structural.composite.unit;

public class Warrior extends UnitOccupation {
	public Warrior(String nickName) {
		super(nickName);
	}
	
	@Override
	public String getOccupation() {
		return "전사";
	}
}

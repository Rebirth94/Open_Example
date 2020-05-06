package portfolio.designpattern.gof.structural.composite.unit;

abstract public class UnitOccupation {
	private final String nickName;
	
	protected UnitOccupation(String nickName) {
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return this.nickName;
	}
	
	abstract public String getOccupation();
}

package portfolio.designpattern.gof.behavioral.iterator.characters;

abstract public class GameCharacter {
	private final String nickName;
	
	protected GameCharacter(String nickName) {
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	abstract public String getOccupation();
	
}

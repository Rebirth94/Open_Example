package portfolio.designpattern.gof.behavioral.iterator.characters;

public class Archer extends GameCharacter {

	public Archer(String nickName) {
		super(nickName);
	}

	@Override
	public String getOccupation() {
		return "궁수";
	}

}

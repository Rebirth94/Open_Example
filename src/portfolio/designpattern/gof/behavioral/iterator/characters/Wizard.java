package portfolio.designpattern.gof.behavioral.iterator.characters;

public class Wizard extends GameCharacter {

	public Wizard(String nickName) {
		super(nickName);
	}

	@Override
	public String getOccupation() {
		return "마법사";
	}

}

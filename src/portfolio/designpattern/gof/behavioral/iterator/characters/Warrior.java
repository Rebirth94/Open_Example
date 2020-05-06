package portfolio.designpattern.gof.behavioral.iterator.characters;

public class Warrior extends GameCharacter {

	public Warrior(String nickName) {
		super(nickName);
	}

	@Override
	public String getOccupation() {
		return "전사";
	}

}

package portfolio.designpattern.gof.behavioral.iterator.aggregate;

import portfolio.designpattern.gof.behavioral.iterator.characters.GameCharacter;
import portfolio.designpattern.gof.behavioral.iterator.iterator.ExampleIterator;
import portfolio.designpattern.gof.behavioral.iterator.iterator.IExampleIterator;

public class CharacterSlot implements Aggregate {
	private GameCharacter[] arrGameChar = new GameCharacter[10];
	private int index = 0;
	
	public void add(GameCharacter gChar) {
		arrGameChar[index] = gChar;
		index++;
	}
	
	@Override
	public IExampleIterator iterator() {
		return new ExampleIterator(arrGameChar);
	}
}

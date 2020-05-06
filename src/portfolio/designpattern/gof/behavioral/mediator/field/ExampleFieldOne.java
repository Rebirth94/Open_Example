package portfolio.designpattern.gof.behavioral.mediator.field;

import portfolio.designpattern.gof.behavioral.mediator.avatar.Avatar;
import portfolio.designpattern.gof.behavioral.mediator.item.Item;
import portfolio.designpattern.gof.behavioral.mediator.item.Potion;

public class ExampleFieldOne implements ExampleField {

	@Override
	public void move(Avatar avater, String location) {
		System.out.println(avater.getName() + "이(가) " + location + "으로 이동.");
	}

	@Override
	public Item pickUpItem() {
		return new Potion();
	}
	
}

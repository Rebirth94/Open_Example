package portfolio.designpattern.gof.behavioral.mediator.field;

import portfolio.designpattern.gof.behavioral.mediator.avatar.Avatar;
import portfolio.designpattern.gof.behavioral.mediator.item.Item;

public interface ExampleField {
	void move(Avatar avater, String location);
	Item pickUpItem();
}

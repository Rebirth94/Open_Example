package portfolio.designpattern.gof.structural.adapter.classadapter;

import portfolio.designpattern.gof.structural.adapter.adaptee.acompany.ACompanyWarrior;
import portfolio.designpattern.gof.structural.adapter.adapter.AvatarAction;

public class AWarriorAdapter extends ACompanyWarrior implements AvatarAction {

	@Override
	public void attack() {
		super.attacking();
	}

	@Override
	public void move() {
		super.moving();
	}

}

package portfolio.designpattern.gof.structural.adapter.classadapter;

import portfolio.designpattern.gof.structural.adapter.adaptee.bcompany.BCompanyWarrior;
import portfolio.designpattern.gof.structural.adapter.adapter.AvatarAction;

public class BWarriorAdapter extends BCompanyWarrior implements AvatarAction {

	@Override
	public void attack() {
		super.offense();
	}

	@Override
	public void move() {
		super.run();
	}

}

package portfolio.designpattern.gof.structural.adapter.adapter;

import portfolio.designpattern.gof.structural.adapter.adaptee.bcompany.BCompanyAction;

public class BCompanyAdapter implements AvatarAction {

	private final BCompanyAction action;
	
	public BCompanyAdapter(BCompanyAction action) {
		this.action = action;
	}
	
	@Override
	public void attack() {
		this.action.offense();
	}

	@Override
	public void move() {
		this.action.run();
	}

}

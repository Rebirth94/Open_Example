package portfolio.designpattern.gof.structural.adapter.adapter;

import portfolio.designpattern.gof.structural.adapter.adaptee.acompany.ACompanyAction;

public class ACompanyAdapter implements AvatarAction {

	private final ACompanyAction action;
	
	public ACompanyAdapter(ACompanyAction action) {
		this.action = action;
	}
	
	@Override
	public void attack() {
		this.action.attacking();
	}

	@Override
	public void move() {
		this.action.moving();
	}

}

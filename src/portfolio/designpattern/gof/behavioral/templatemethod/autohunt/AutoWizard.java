package portfolio.designpattern.gof.behavioral.templatemethod.autohunt;

import portfolio.designpattern.gof.behavioral.templatemethod.occupation.Wizard;

public class AutoWizard extends AutoHunt {
	private Wizard wizard;
	
	public AutoWizard(Wizard wizard) {
		super(wizard.getName());
		this.wizard = wizard;
	}

	@Override
	protected void battleFormExecution() {
		wizard.attack();
		wizard.defend();
		wizard.potionDrinking();
		wizard.potionDrinking();
		wizard.activeSkil();
	}
	
}

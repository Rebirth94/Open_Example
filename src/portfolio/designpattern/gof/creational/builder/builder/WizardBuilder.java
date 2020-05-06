package portfolio.designpattern.gof.creational.builder.builder;

public class WizardBuilder extends AvatarBuilder {
	
	public WizardBuilder(String nickName) {
		super(nickName);
	}

	@Override
	public void buildOccupation() {
		super.avatar.setOccupation("마법사");
	}
}

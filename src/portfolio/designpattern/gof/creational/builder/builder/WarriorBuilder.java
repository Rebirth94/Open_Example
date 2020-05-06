package portfolio.designpattern.gof.creational.builder.builder;

public class WarriorBuilder extends AvatarBuilder {
	
	public WarriorBuilder(String nickName) {
		super(nickName);
	}
	@Override
	public void buildOccupation() {
		super.avatar.setOccupation("전사");
	}
}

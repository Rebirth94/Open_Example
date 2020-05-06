package portfolio.designpattern.gof.creational.builder.builder;

public class ArcherBuilder extends AvatarBuilder {
	
	public ArcherBuilder(String nickName) {
		super(nickName);
	}

	@Override
	public void buildOccupation() {
		super.avatar.setOccupation("궁수");
	}
}

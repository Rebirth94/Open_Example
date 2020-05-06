package portfolio.designpattern.gof.creational.builder.director;

import portfolio.designpattern.gof.creational.builder.avatar.Avatar;
import portfolio.designpattern.gof.creational.builder.builder.AvatarBuilder;

public class JumpingAvatarDirector implements AvatarDirector {
	
	private AvatarBuilder builder;
	
	public JumpingAvatarDirector(AvatarBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public Avatar build() {
		builder.buildLevel(100);
		builder.buildOccupation();
		builder.buildWeapon("풀강 무기");
		builder.buildArmor("풀강 방어구");
		return builder.build();
	}
	
}

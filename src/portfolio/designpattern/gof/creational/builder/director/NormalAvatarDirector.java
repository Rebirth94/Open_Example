package portfolio.designpattern.gof.creational.builder.director;

import portfolio.designpattern.gof.creational.builder.avatar.Avatar;
import portfolio.designpattern.gof.creational.builder.builder.AvatarBuilder;

public class NormalAvatarDirector implements AvatarDirector {
	
	private AvatarBuilder builder;
	
	public NormalAvatarDirector(AvatarBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public Avatar build() {
		builder.buildLevel(1);
		builder.buildOccupation();
		return builder.build();
	}
	
}

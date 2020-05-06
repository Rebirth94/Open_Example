package portfolio.designpattern.gof.structural.flyweight.npc.share;

import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcGender;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcType;

// ConctreteFlyweight
public class FlyweightSecurityWomanNpc extends FlyweightNpc {
	public FlyweightSecurityWomanNpc() {
		super(NpcGender.WOMAN.getNpcGender(), NpcType.SECURITY.getNpcType());
	}
}

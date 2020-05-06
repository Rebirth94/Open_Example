package portfolio.designpattern.gof.structural.flyweight.npc.share;

import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcGender;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcType;

// ConctreteFlyweight
public class FlyweightSecurityManNpc extends FlyweightNpc {
	public FlyweightSecurityManNpc() {
		super(NpcGender.MAN.getNpcGender(), NpcType.SECURITY.getNpcType());
	}
}

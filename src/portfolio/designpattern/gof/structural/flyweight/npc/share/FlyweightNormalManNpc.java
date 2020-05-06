package portfolio.designpattern.gof.structural.flyweight.npc.share;

import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcGender;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcType;

// ConctreteFlyweight
public class FlyweightNormalManNpc extends FlyweightNpc {
	public FlyweightNormalManNpc() {
		super(NpcGender.MAN.getNpcGender(), NpcType.NORMAL.getNpcType());
	}
}

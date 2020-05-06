package portfolio.designpattern.gof.structural.flyweight.npc.share;

import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcGender;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcType;

// ConctreteFlyweight
public class FlyweightNormalWomanNpc extends FlyweightNpc {
	public FlyweightNormalWomanNpc() {
		super(NpcGender.WOMAN.getNpcGender(), NpcType.NORMAL.getNpcType());
	}
}

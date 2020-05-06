package portfolio.designpattern.gof.structural.flyweight.npc.factory;

import java.util.HashMap;
import java.util.Map;

import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcGender;
import portfolio.designpattern.gof.structural.flyweight.npc.resource.NpcType;
import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightNormalManNpc;
import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightNormalWomanNpc;
import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightNpc;
import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightSecurityManNpc;
import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightSecurityWomanNpc;

// FlyweightFactory
public class FlyweightNpcFactory {
	private static final FlyweightNpcFactory instance = new FlyweightNpcFactory();

	private Map<String, FlyweightNpc> npcPool = new HashMap<>();
	
	private FlyweightNpcFactory() {}
	public static FlyweightNpcFactory getInstance() {
		return instance;
	}

	public FlyweightNpc getFlyweightNpc(NpcGender gender, NpcType type) {
		String objKey = gender.getNpcGender() + type.getNpcType();
		FlyweightNpc npc = npcPool.get(objKey);
		
		if(npc == null) {
			
			switch(gender) {
				case MAN :
					switch (type) {
						case NORMAL: npc = new FlyweightNormalManNpc(); break;
						case SECURITY: npc = new FlyweightSecurityManNpc(); break;
					}
				break;
				
				case WOMAN :
					switch (type) {
						case NORMAL: npc = new FlyweightNormalWomanNpc(); break;
						case SECURITY: npc = new FlyweightSecurityWomanNpc(); break;
					}
				break;
			}
			
			npcPool.put(objKey, npc);
		}
		
		return npc;
	}
}

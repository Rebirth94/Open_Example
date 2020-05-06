package portfolio.designpattern.gof.structural.flyweight.npc.resource;

public enum NpcType {
	NORMAL("일반시민"), SECURITY("경비원");
	
	private final String npcType; 
	
	private NpcType(String npcType) {
		this.npcType = npcType;
	}

	final public String getNpcType() {
		return npcType;
	}
}

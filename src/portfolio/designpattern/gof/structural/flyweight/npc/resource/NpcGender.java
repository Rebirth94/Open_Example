package portfolio.designpattern.gof.structural.flyweight.npc.resource;

public enum NpcGender{
	MAN("남자"), WOMAN("여자");
	
	private final String npcGender; 
	
	private NpcGender(String npcGender) {
		this.npcGender = npcGender;
	}

	final public String getNpcGender() {
		return npcGender;
	}
}
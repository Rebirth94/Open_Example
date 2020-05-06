package portfolio.designpattern.gof.structural.flyweight.npc.share;

import portfolio.designpattern.gof.structural.flyweight.FlyweightClient;

// Flyweight
abstract public class FlyweightNpc {

	private final int skinSize = 1024;
	
	private final String skin;
	private final String gender;
	private final String type;

	public FlyweightNpc(String gender, String type) {
		this.skin = gender + " " + type + "[그래픽 리소스 용량 : " + skinSize + " Kbyte]";
		this.gender = gender;
		this.type = type;
		
		FlyweightClient.addTempMemory(skinSize);
	}

	public String getSkin() {
		return skin;
	}

	public String getGender() {
		return gender;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "FlyweightNpc [skinSize=" + skinSize + ", skin=" + skin + "\n, gender=" + gender + ", type=" + type + "]";
	}
}

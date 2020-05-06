package portfolio.designpattern.gof.structural.flyweight.npc;

import portfolio.designpattern.gof.structural.flyweight.npc.share.FlyweightNpc;

// UnsharedConctreteFlyweight
public class Npc {
	
	private final FlyweightNpc flyweightNpc;
	private final String name;
	private int axisX;
	private int axisY;
	
	public Npc(FlyweightNpc flyweightNpc, String name, int axisX, int axisY) {
		this.flyweightNpc = flyweightNpc;
		this.name = name;
		setAxisX(axisX);
		setAxisY(axisY);
	}
	
	public FlyweightNpc getFlyweightNpc() {
		return flyweightNpc;
	}

	public String getName() {
		return name;
	}

	public int getAxisX() {
		return axisX;
	}
	public void setAxisX(int axisX) {
		this.axisX = axisX;
	}
	public int getAxisY() {
		return axisY;
	}
	public void setAxisY(int axisY) {
		this.axisY = axisY;
	}

	@Override
	public String toString() {
		return "Npc [flyweightNpc=" + flyweightNpc + ", name=" + name + ", axisX=" + axisX + ", axisY=" + axisY + "]";
	}

}

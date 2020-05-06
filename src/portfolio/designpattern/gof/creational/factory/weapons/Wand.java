package portfolio.designpattern.gof.creational.factory.weapons;

public class Wand implements Weapons {
	@Override
	public void make() {
		System.out.println("지팡이를 제작하였습니다.");
	}
}

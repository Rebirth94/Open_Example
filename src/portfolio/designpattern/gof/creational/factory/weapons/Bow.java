package portfolio.designpattern.gof.creational.factory.weapons;

public class Bow implements Weapons {
	@Override
	public void make() {
		System.out.println("활을 제작하였습니다.");
	}
}

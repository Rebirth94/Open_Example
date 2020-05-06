package portfolio.designpattern.gof.creational.factory.weapons;

public class Empty implements Weapons {
	@Override
	public void make() {
		System.out.println("제작 가능한 무기를 선택하세요.");
	}
}

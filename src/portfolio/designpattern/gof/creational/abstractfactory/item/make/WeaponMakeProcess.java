package portfolio.designpattern.gof.creational.abstractfactory.item.make;

public class WeaponMakeProcess implements ItemMakeProcess {
	@Override
	public void make() {
		System.out.println("무기 제작");
	}
}
